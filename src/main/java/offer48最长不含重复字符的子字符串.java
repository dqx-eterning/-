import javax.xml.bind.annotation.XmlSchema;
import java.util.HashSet;
import java.util.Set;

public class offer48最长不含重复字符的子字符串 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int right = 0,left = 0,res = 0;
        while (right < s.length()){
            char c = s.charAt(right++);
            //存在重复的字符，则移动左指针，直到滑动窗口中不含有该字符
            while (set.contains(c)){
                //出现重复，则删除左指针指向的元素，将此元素再次添加进set，形成新的子串
                set.remove(s.charAt(left++));
            }
            set.add(c);
            res = Math.max(res,right-left);
        }
        return res;
    }
}

