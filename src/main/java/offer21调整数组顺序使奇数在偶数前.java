import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class offer21调整数组顺序使奇数在偶数前 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] exchange = exchange(nums);
        for (int i : exchange) {
            System.out.println(i);
        }
    }
    public static int[] exchange(int[] nums) {
        int[] arr1 = new int[nums.length];
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                arrayList.add(nums[i]);
            }
        } for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                arrayList.add(nums[i]);
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            arr1[i] = arrayList.get(i);
        }


        return arr1;
    }

    /*
    简单方法
    * if (nums == null || nums.length == 0)
            return nums;
        int left = 0;
        int right = nums.length - 1;
        int temp[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & 1) == 0) {//偶数
                temp[right--] = nums[i];
            } else {//奇数
                temp[left++] = nums[i];
            }
        }
        return temp;*/
}
