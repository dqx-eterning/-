import java.util.HashMap;
@SuppressWarnings("all")
public class offer53统计一个数字在排序数组中出现的次数 {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        System.out.println(search(arr,8));

    }
    public static int search(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int res;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                Integer temp = map.get(nums[i]);
                temp = temp +1;
                map.put(nums[i],temp);
            }else{
                map.put(nums[i],1);
            }
        }
        for (Integer integer : map.keySet()) {
            if (integer == target){
                return map.get(integer);
            }
        }
        return 0;
    }
}
