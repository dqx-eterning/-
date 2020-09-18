import java.util.Arrays;

public class 数组拆分 {
    public static void main(String[] args) {
        int[] arr ={1,4,3,2};
        int i = arrayPairSum(arr);
        System.out.println(i);
    }
    public static int arrayPairSum(int[] nums){
        int sum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i=i+2) {

            sum = sum + i;
        }
        return  sum;
    }

}
