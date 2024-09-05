package non_linear.trees;

class Node {
    int val;
    Node left;
    Node rigth;

    public Node(int num) {
        val = num;
        left = rigth = null;
    }
}

public class Tree1 {
    Node root;

    public void display(Node n) {
        if (n != null) {
            display(n.left);
            System.out.println(n.val);
            display(n.rigth);
        }
    }

    public static void main(String[] args) {
        Tree1 obj = new Tree1();
        obj.root = new Node(100);
        obj.root.left = new Node(200);
        obj.root.rigth = new Node(300);
        obj.root.left.rigth = new Node(500);
        obj.root.left.left = new Node(400);
        obj.display(obj.root);
    }
}
