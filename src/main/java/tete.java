import java.util.ArrayList;

import java.util.Scanner;


public class tete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int count = 0;
        ArrayList<ArrayList<Integer>> divisionList = divideInt_r(a, a);
        for (ArrayList<Integer> list : divisionList) {
            if (list.size()<=b){
                count++;
            }
        }
        System.out.println(count);
    }
    public static ArrayList<ArrayList<Integer>> divideInt_r(int n, int max){
        ArrayList<ArrayList<Integer>> divisionList = new ArrayList<ArrayList<Integer>>();
        if(n <= 1){
            ArrayList<Integer> list = new ArrayList<Integer>();
            if(n==1) list.add(1);
            divisionList.add(list);
            return divisionList;
        }
        for(int i=max; i>0; i--){
            ArrayList<ArrayList<Integer>> newDivList = divideInt_r(n-i, Math.min(n-i, i));//sublist中的元素既不能超过i，也不能超过n-i
            for(ArrayList<Integer> sublist : newDivList){
                sublist.add(0, i);
                divisionList.add(sublist);
            }
        }
        return divisionList;
    }

}
