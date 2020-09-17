import java.util.HashSet;
import java.util.Set;

public class 判定字符是否唯一 {
    public static void main(String[] args) {
        String astr = "leetcode";
        //boolean b = isUnique(astr);
        boolean b = isUnique1(astr);
        System.out.println(b);
    }


    public static boolean isUnique(String astr){
        for (char ch : astr.toCharArray()) {
            if (astr.indexOf(ch) != astr.lastIndexOf(ch)){
                return  false;
            }
        }
        return true;
    }

    public static boolean isUnique1(String astr){
        Set<Character> set = new HashSet<Character>();
        for (int i = 0; i <astr.length() ; i++) {
            set.add(astr.charAt(i));
        }
        return astr.length() == set.size();
    }
}
