package inflearn;

import java.util.LinkedList;
import java.util.Queue;

// 인프런 말단노드까지의 가장 짧은 경로(BFS)
class Nodenodenode {
    int data;
    Nodenodenode lt, rt;
    public Nodenodenode(int val) {
        data=val;
        lt=rt=null;
    }
}

public class Quiz41{
    Nodenodenode root;
    public int BFS(Nodenodenode root){
        Queue<Nodenodenode> Q=new LinkedList<>();
        Q.offer(root);
        int L=0;
        while(!Q.isEmpty()){
            int len=Q.size();
            for(int i=0; i<len; i++){
                Nodenodenode cur=Q.poll();
                if(cur.lt==null && cur.rt==null) return L;
                if(cur.lt!=null) Q.offer(cur.lt);
                if(cur.rt!=null) Q.offer(cur.rt);
            }
            L++;
        }
        return 0;
    }

    public static void main(String args[]) {
        Quiz41 tree=new Quiz41();
        tree.root=new Nodenodenode(1);
        tree.root.lt=new Nodenodenode(2);
        tree.root.rt=new Nodenodenode(3);
        tree.root.lt.lt=new Nodenodenode(4);
        tree.root.lt.rt=new Nodenodenode(5);
        System.out.println(tree.BFS(tree.root));
    }
}