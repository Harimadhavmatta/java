package tree;

class node {
    int data;
    node right, left;

    node(int d) {
        data = d;
        right = left = null;
    }
}

public class Binary {
    node root;

    Binary() {
        node root = null;
    }

    void insert(int data) {
        hiddeninsert(root, data);
    }

    node hiddeninsert(node node, int data) {

        if (node == null) {
            node obj = new node(data);
            root = obj;
        } else if (data > root.data) {
            root.right = hiddeninsert(root.right, data);
            ;
        } else if (data < root.data) {
            root.left = hiddeninsert(root.left, data);
            ;

        }
        return root;
    }

    public static void main(String[] args) {

    }
}
