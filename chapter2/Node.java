package chapter2;

/**
 * Created by craigjohnson on 9/3/16.
 */
public class Node {
    Node next = null;
    int data;

    public Node(int d) {
        data = d;
    }

    void append(int d) {
        Node end = new Node(d);
        Node n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    void deleteNode(Node n) {
        System.out.println(n.data);
        if (n.next == null) {
            n =null;
        }
        else {
            n.data = n.next.data;
            n.next = n.next.next;
        }
    }

    public static void printList(Node n) {
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
}
