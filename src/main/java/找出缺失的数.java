import java.util.Arrays;

public class 找出缺失的数 {
    public static void main(String[] args) {
        int[] arr = {0,2,3};
        int i = missingNumber(arr);
        System.out.println(i);
    }
    public static int missingNumber(int[] nums) {
        int a = 0;
        int[] arr = new int[nums.length+1];
        for (int i : nums) {
           arr[i]= i;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 && i!=0){
                a=i;
            }
        }
        return a;
    }
}
