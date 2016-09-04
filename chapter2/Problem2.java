package chapter2;

/**
 * Created by craigjohnson on 9/3/16.
 */
public class Problem2 {
    public static void main(String[] args) {
        Node n = setupList();

        System.out.println(findKthLast(n, 1).data);
    }


    public static Node findKthLast(Node n, int k) {
        Node curr = n;
        Node run = n;

        if (n != null) {
            for (int i = 0; i < k; i++) {
                if (curr.next == null && i != k)
                    return null;
                else {
                    run = run.next;
                }
            }

            while (run != null) {
                run = run.next;
                curr = curr.next;
            }
        }
        return curr;
    }



    public static Node setupList() {
        Node n = new Node(1);
        n.append(2);
        n.append(3);
        n.append(4);
        n.append(5);
        n.append(6);

        return n;
    }
}
