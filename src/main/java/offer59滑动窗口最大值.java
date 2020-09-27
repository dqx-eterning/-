import java.util.ArrayList;

public class offer59滑动窗口最大值 {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k =3;
        int[] ints = maxSlidingWindow(nums, k);
        for (int anInt : ints) {
            System.out.print(anInt);
        }
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (nums.length == 0){
            return new int[0];
        }
        for (int i = 0; i <= nums.length-k; i++) {
            int max = nums[i];
            for (int j = i; j < i+k; j++) {
                if (nums[j]>max){
                    max = nums[j];
                }
            }
            arrayList.add(max);
        }
        int[] arr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            arr[i] = arrayList.get(i);
        }
        return arr;
    }
}
