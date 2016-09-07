package CTCI.chapter2;
import java.util.*;

/**
 * Created by craigjohnson on 9/3/16.
 */
public class Problem5 {
    public static void main(String[] args) {
        Node l1 = new Node(6);
        l1.append(1);
        l1.append(7);

        Node l2 = new Node(2);
        l2.append(9);
        l2.append(5);
        int[] arr = {4,5,6,5};
        System.out.println(addLists(l1, l2));
        System.out.println(addListForward(l1, l2));
    }

    public static int addLists(Node l1, Node l2) {
        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();
        int i = 0;
        while (l1 != null) {
            num1.insert(i, l1.data);
            i++;
            l1 = l1.next;
        }
        i = 0;
        while (l2 != null) {
            num2.insert(i, l2.data);
            i++;
            l2 = l2.next;
        }

        int numOne = Integer.parseInt(num1.toString());
        int numTwo = Integer.parseInt(num2.toString());
        System.out.println(numOne);
        System.out.println(numTwo);
        return numOne + numTwo;

    }

    public static int addListForward(Node l1, Node l2) {
        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();
        int i = 0;
        while (l1 != null) {
            num1.append(l1.data);
            i++;
            l1 = l1.next;
        }
        i = 0;
        while (l2 != null) {
            num2.append(l2.data);
            i++;
            l2 = l2.next;
        }

        int numOne = Integer.parseInt(num1.toString());
        int numTwo = Integer.parseInt(num2.toString());
        System.out.println(numOne);
        System.out.println(numTwo);
        return numOne + numTwo;

    }

}
