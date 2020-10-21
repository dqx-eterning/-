public class offer42连续子数组得最大和 {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(new offer42连续子数组得最大和().maxSubArray(arr));
    }
    //动态规划解题，划分为小问题，
    public  int maxSubArray(int[] nums) {
        int[] arr = new int[nums.length];
        arr[0] = nums[0];
        int max = arr[0];
        for (int i = 1; i < nums.length ; i++) {
            arr[i] = Math.max(arr[i-1]+nums[i],nums[i]);
            max = Math.max(max,arr[i]);
        }
        return  max;
    }
}
