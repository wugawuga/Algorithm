package inflearn;

import java.util.LinkedList;
import java.util.Queue;

// 인프런 이진트리 레벨탐색(BFS)
class Nodes{
    int data;
    Nodenodes lt, rt;
    public Nodes(int val) {
        data=val;
        lt=rt=null;
    }
}
public class Quiz38{
    Nodenodes root;
    public void BFS(Nodenodes root){
        Queue<Nodenodes> Q=new LinkedList<>();
        Q.add(root);
        int L=0;
        while(!Q.isEmpty()){
            int len = Q.size();
            System.out.print(L+" : ");
            for(int i=0; i<len; i++){
                Nodenodes cur = Q.poll();
                System.out.print(cur.data+" ");
                if(cur.lt!=null) Q.add(cur.lt);
                if(cur.rt!=null) Q.add(cur.rt);
            }
            L++;
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Quiz38 tree=new Quiz38();
        tree.root=new Nodenodes(1);
        tree.root.lt=new Nodenodes(2);
        tree.root.rt=new Nodenodes(3);
        tree.root.lt.lt=new Nodenodes(4);
        tree.root.lt.rt=new Nodenodes(5);
        tree.root.rt.lt=new Nodenodes(6);
        tree.root.rt.rt=new Nodenodes(7);
        tree.BFS(tree.root);
    }
}