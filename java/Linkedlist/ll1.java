package Linkedlist;

class node {
    int data;
    node nxt;

    node(int x) {
        data = x;
        nxt = null;
    }
}

public class ll1 {
    static node head = null;
    static node temp = null;

    static void insert(int y) {
        node obj = new node(y);
        if (head == null) {
            temp = head = obj;

        } else {
            temp.nxt = obj;
            // obj = temp;
            temp = obj;
        }
    }

    static void push(int data, int pos) {
        int p = 0;
        node obj = new node(data);
        if (pos == 0) {
            obj.nxt = head.nxt;
            node temp = head;
            obj = head;

        } else {

        }
    }

    static void display() {
        node x = head;
        do {
            System.out.print(x.data + " ");
            x = x.nxt;
        } while (x != null);
    }

    public static void main(String[] args) {
        insert(0);
        insert(1);
        insert(2);
        insert(13);
        display();
    }
}
