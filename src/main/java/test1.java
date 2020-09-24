import com.sun.xml.internal.ws.api.message.MessageWritable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.DoublePredicate;
import java.util.zip.CheckedOutputStream;

public class test1 {
    public static void main(String[] args) {
        String[] a = {"-1","2","1"};
        //System.out.println(findGreatestSumOfSubArray(a));

        String s = "19 7 8 5";
        System.out.println(sort(s));

    }

    public static int sort (String inData) {
        Map<Integer,Integer> map = new HashMap<>();
       String[] strings = inData.split(" ");
       int[] value = new int[strings.length];
        for (int i = 0; i <strings.length; i++) {
            value[i] = Integer.parseInt(strings[i]);
            map.put(Integer.parseInt(strings[i]),i);
        }
        Arrays.sort(value);
        int index = map.size();
        int count = 0;
        for (int i = 0; i < map.size() - 1; i++) {
            if (map.get(value[i]) > map.get(value[i+1])){
                map.put(value[i+1],index++);
                count++;
            }
        }
        return count;
    }

    public static int findGreatestSumOfSubArray (String[] array) {
        int[] nums = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            nums[i] = Integer.parseInt(array[i]);
        }
        int tag = 0;
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
          if (tag <= 0){
              tag = nums[i];
          }else{
              tag += nums[i];
          }
          if (max < tag){
              max = tag;
          }
        }
        return max;
    }


}
