package CTCI.chapter2;

/**
 * Created by craigjohnson on 9/3/16.
 */
public class Problem3 {
    public static void main(String[] args) {
        Node n = new Node(1);
        n.append(2);
        n.append(3);
        n.append(4);
        n.append(5);
        n.append(6);

        Node curr = n.next.next.next;
        deleteNode(curr);
        Node.printList(n);
    }

    public static void deleteNode(Node n) {
        n.data = n.next.data;
        n.next = n.next.next;
    }
}
