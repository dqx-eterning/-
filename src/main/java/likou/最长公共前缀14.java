package likou;

public class 最长公共前缀14 {
    public static void main(String[] args) {
       String[] strings = {"ab","a"};
       String[] strings1 = {"dog","racecar","car"};
       System.out.println(longestCommonPrefix(strings1));
    }
    //使用了冒泡排序的思想
    private static final String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        if (strs.length == 1) return strs[0];

        String res = "";
        res = help(strs[0],strs[1]);
        if (res == null) return "";

        for (int i = 2; i < strs.length; i++) {
            res = help(res,strs[i]);
            if (res == null) return "";
        }
        return res;
    }

    private static String help(String s1,String s2){
        int len = Math.min(s1.length(),s2.length());
        for (int i = len; i > 0; i--) {
            String t = s1.substring(0,i);
            if (t.equals(s2.substring(0,i))){
                return t;
            }
        }
        return null;
    }
}
