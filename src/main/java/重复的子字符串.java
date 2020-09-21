import java.util.HashSet;
import java.util.Set;

public class 重复的子字符串 {
    public static void main(String[] args) {
        String a = "abcabcabc";
        boolean b = repeatedSubstringPattern(a);
        System.out.println(b);

    }
    public  static boolean repeatedSubstringPattern(String s) {
        if (s.length() == 1 ) {
            return false;
        }

        for (int i = 1; i < s.length(); i++) {
            boolean tag = true;
            if ( s.length() % i == 0){
                String s1 = s.substring(0,i);
                for (int j = i; j + i <= s.length(); j=j+i) {
                    if ( !s.substring(j,j+i).equals(s1)){
                        tag = false;
                    }
                }
                if (tag){
                    return true;
                }

            }
        }
        return false;
    }
}
