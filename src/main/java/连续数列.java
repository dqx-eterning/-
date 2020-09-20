public class 连续数列 {

    public static void main(String[] args) {
        int[] a = {-2,1,-3,4,-1,2,1,-5,4};
        int i = maxSubArray(a);
        System.out.println(i);
    }
    public static int maxSubArray(int[] nums) {
        int sum = nums[0];
        int b = sum;
        for (int i = 1; i < nums.length; i++) {
           if (b < 0){
               b = nums[i];
           }else{
               b =  b + nums[i];
           }
           if (b > sum){
               sum = b;
           }
        }
        return sum;
    }
}
