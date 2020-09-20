
public class 重复的子字符串 {
    public static void main(String[] args) {
        String a = "ababba";
        boolean b = repeatedSubstringPattern(a);
        System.out.println(b);

    }
    public  static boolean repeatedSubstringPattern(String s) {
        if (s.length() == 1 || s.length() % 2 == 1){
            return false;
        }
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(0)){
                for (int j = 0; j < i; j++) {
                    if (s.charAt(j) != s.charAt(i+j)){
                        return false;
                    }
                }
                if (i == s.length()-1)
                return true;
            }
        }
        return false;
    }
}
