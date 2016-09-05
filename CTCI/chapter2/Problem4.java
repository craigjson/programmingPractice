package  CTCI.chapter2;

/**
 * Created by craigjohnson on 9/3/16.
 */
public class Problem4 {
    public static void main(String[] args) {
        Node n = new Node(1);
        n.append(1);

        Node.printList(partitionList(n, 0));
    }

    public static Node partitionList(Node n, int pivot) {
        Node small = null, large = null, connect = null, prev;
        Node smallHead = n;
        while (n != null) {
            prev = n;
            n = n.next;
            prev.next = null;

            if (prev.data < pivot) {
                if (small == null) {
                    smallHead = prev;
                    small = prev;
                } else {
                    small.next = prev;
                    small = small.next;
                }
            } else {
                if (large == null) {
                    connect = prev;
                    large = prev;
                } else {
                    large.next = prev;
                    large = large.next;
                }
            }
        }

        n = smallHead;
        if (small != null)
            small.next = connect;
        return n;
    }
}
