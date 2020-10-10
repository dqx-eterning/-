import java.util.HashMap;
import java.util.Map;

public class offer03数组中重复的数字 {
    public static void main(String[] args) {
        int[] nums = {2,3,1,0,2,5,3} ;
        aVoid(nums);
        System.out.println(findRepeatNumber(nums));
    }
    public static int findRepeatNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                return nums[i];
            }else {
                map.put(nums[i],1);
            }
        }
        return 0;
    }
    public static void aVoid(int[] nums) {
        int count = 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])){

                map.put(nums[i],map.get(nums[i])+1);
                //return nums[i];
            }else {
                map.put(nums[i],1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key +" + "+value);
        }
    }
}
