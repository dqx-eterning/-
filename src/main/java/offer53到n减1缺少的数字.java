public class offer53到n减1缺少的数字 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,9};
        System.out.println(missingNumber(arr));
        System.out.println(missingNumber1(arr));
    }
    //有序数组，二分查找
    public static int missingNumber(int[] nums) {
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            int m = (i + j) / 2;
            if (nums[m] == m) i = m + 1;
            else j = m - 1;
        }
        return i;

    }
    //直接对比数组下标
    public static int missingNumber1(int[] nums) {
        if (nums[0] == 1) return 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) return i;
        }
        return nums.length;
    }
}
