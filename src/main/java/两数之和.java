import java.util.HashMap;
import java.util.Map;

public class 两数之和 {
    public static void main(String[] args) {
        int[] arr = {2,7,11,0};
        int target = 13;
        int[] twoSum = twoSum(arr, target);
        for (int i : twoSum) {
            System.out.println(i);
        }
    }
    public static int[] twoSum( int[] nums, int target){
        int[] result = new int[2];
        int length = nums.length;
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i= 0;i<length;i++){
            int key = nums[i];
            int value = i;
            int temp = target - key;
            if (map.containsKey(temp)){
                result[1] = i;
                result[0] = map.get(temp);
                return result;
            }
            map.put(key,value);
        }
        throw new RuntimeException("未找到匹配的数据");
    }
}
