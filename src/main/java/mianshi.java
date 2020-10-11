import sun.security.util.Length;

import java.util.ArrayList;

public class mianshi {
    public static void main(String[] args) {
        String s = "GGBBG";

    }
    public static ArrayList<ArrayList<Integer>> binaryTreeScan (int[] input) {
        // write code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i = 1; i < (input.length)/2; i++) {
            list1.add(input[i]);
            list1.add(input[2*i]);
            list1.add(input[2*i+1]);
        }
        for (int i = 1; i < (input.length)/2; i++) {
            list2.add(input[2*i]);
            list2.add(input[i]);

            list2.add(input[2*i+1]);
        }
        for (int i = 1; i < (input.length)/2; i++) {
            list3.add(input[i]);
            list3.add(input[2*i]);
            list3.add(input[2*i+1]);
            list3.add(input[i]);
        }
        list.add(list1);
        list.add(list2);
        list.add(list3);
        return list;
    }
}
