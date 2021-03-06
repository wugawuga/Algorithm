package inflearn;

import java.io.IOException;

// 인프런 이진트리순회(DFS : Depth-First Search)
class Node {

    int data;
    Nodenodes lt, rt;
    public Node(int val) {
        this.data = val;
        lt = rt = null;
    }
}

public class Quiz14 {

    Nodenodes root;
    public void DFS(Nodenodes root) {

        if (root == null) {
            return;
        } else {
            // 1. 전위 순회
//            System.out.print(root.data+" ");
//            DFS(root.lt);
//            DFS(root.rt);
            // 2. 중위 순회
            DFS(root.lt);
            System.out.print(root.data+" ");
            DFS(root.rt);
            // 3. 후위 순회
//            DFS(root.lt);
//            DFS(root.rt);
//            System.out.print(root.data+" ");
        }
    }

    public static void main(String[] args) throws IOException {

        Quiz14 tree = new Quiz14();
        tree.root = new Nodenodes(1);
        tree.root.lt = new Nodenodes(2);
        tree.root.rt = new Nodenodes(3);
        tree.root.lt.lt = new Nodenodes(4);
        tree.root.lt.rt = new Nodenodes(5);
        tree.root.rt.lt = new Nodenodes(6);
        tree.root.rt.rt = new Nodenodes(7);
        tree.DFS(tree.root);
    }
}
