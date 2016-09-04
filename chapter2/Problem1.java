package chapter2;
import java.util.*;

/**
 * Created by craigjohnson on 9/3/16.
 */
public class Problem1 {
    public static void main(String [] args) {
        Node n = setupList();
        removeDuplicates(n);

        Node.printList(n);
    }

    private static void removeDuplicates(Node n) {
        HashSet<Integer> set = new HashSet<>();
        Node curr = n;
        Node prev = null;
        while (curr != null) {
            if (set.contains(curr.data)) {
                prev.next = curr.next;
            } else {
                set.add(curr.data);
                prev = curr;
            }
        }
    }

    private static Node setupList() {
        Node n = new Node(1);
        n.append(2);
        n.append(3);
        n.append(4);
        n.append(5);
        n.append(4);
        n.append(5);
        n.append(6);
        n.append(6);
        n.append(7);
        n.append(1);
        return n;
    }
}
