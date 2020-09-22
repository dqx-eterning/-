import java.util.ArrayList;

public class 按奇偶排序数组922 {
    public static void main(String[] args) {
        int[] arr = {4,2,5,7};
        int[] ints = sortArrayByParityII(arr);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
    public static int[] sortArrayByParityII(int[] A) {
        int[] arr3 = new int[A.length];
        ArrayList<Integer> ints1 = new ArrayList<Integer>();
        ArrayList<Integer> ints2 = new ArrayList<Integer>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0){
                ints1.add(A[i]);
            }else{
                ints2.add(A[i]);
            }
        }
        for (int i = 0,j=0; i < A.length&&j<A.length/2; i+=2,j++) {
            arr3[i] = ints1.get(j);
            arr3[i+1] = ints2.get(j);
        }
        return arr3;

    }
}
