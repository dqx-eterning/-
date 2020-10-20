import java.util.HashMap;
import java.util.Map;

public class offer39数组中出现次数超过一般的数 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,2,2,5,4,2};
        System.out.println(majorityElement(arr));
    }
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                Integer integer = map.get(nums[i]);
                integer = integer+1;
                map.put(nums[i],integer);
            }else{
                map.put(nums[i],1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer value = entry.getValue();
            if (value > nums.length/2){
                return entry.getKey();
            }
        }
        return 0;
    }
}
