package inflearn;

// 인프런 말단노드까지의 가장 짧은 경로(DFS)
class Nodenodes {
    int data;
    Nodenodes lt, rt;
    public Nodenodes(int val) {
        data=val;
        lt=rt=null;
    }
}

public class Quiz40{
    Nodenodes root;
    public int DFS(int L, Nodenodes root){
        if(root.lt==null && root.rt==null) return L;
        else return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
    }

    public static void main(String args[]) {
        Quiz40 tree=new Quiz40();
        tree.root=new Nodenodes(1);
        tree.root.lt=new Nodenodes(2);
        tree.root.rt=new Nodenodes(3);
        tree.root.lt.lt=new Nodenodes(4);
        tree.root.lt.rt=new Nodenodes(5);
        System.out.println(tree.DFS(0, tree.root));
    }
}