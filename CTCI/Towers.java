package CTCI;

import java.util.ArrayList;
import java.util.*;
import java.io.*;


/**
 * Created by craigjohnson on 9/6/16.
 */
public class Towers {

    public static void main(String[] args) {
        try {
            File file = new File("/Users/craigjohnson/IdeaProjects/Practice/src/CTCI/Tower-of-Hanoi_InputForSubmission_1.txt");

            Scanner input = new Scanner(file);

            while (input.hasNext()) {
                ArrayList<Integer> list = new ArrayList<Integer>();

                String[] line = input.nextLine().split(",");
                if (!line[1].equals(line[2]))
                    move(Integer.parseInt(line[0]),
                        Integer.parseInt(line[1]),
                        Integer.parseInt(line[2]),
                        1, list);

                System.out.println(list.size());

            }
        } catch (Exception e) {
            System.out.println("Failed Bad File");
        }
    }

    public static void move(int n, int from, int to, int via, ArrayList<Integer> list) {
        if (n == 1) {
            list.add(1);
        } else {
            move(n - 1, from, via, to, list);
            move(1, from, to, via, list);
            move(n - 1, via, to, from, list);
        }
    }
}
