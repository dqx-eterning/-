import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class offer50第一个只出现一次的字符 {
    public static void main(String[] args) {
        //String s = "abaccdeff";
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }
    public static char firstUniqChar(String s) {
        if (s == null || s.length() == 0){
            return ' ';
        }
        HashMap<Character,Integer> map = new LinkedHashMap<>();
        char res = '0';
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))){
                int te = map.get(s.charAt(i));
                te=te+1;
                map.put(s.charAt(i),te);
            }else {
                map.put(s.charAt(i),1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1 ){
               res =  entry.getKey();
               flag = true;
                break;
            }
        }
        if (flag){
            return res;
        }else{
            return ' ';
        }

    }
}
