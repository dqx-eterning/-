package likou;

public class 最长公共前缀14 {
    public static void main(String[] args) {
       String[] strings = {"ab","a"};
       System.out.println(longestCommonPrefix(strings));
    }
    private static final String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0){
            return "";
        }
        if (strs.length == 1){
            return strs[0];

        }
        boolean flag = false;
        int less = strs[0].length();
        int index =0 ;
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < less ){
                index = i;
            }
        }
        for (int i = 0; i < strs[index].length(); i++) {
            for (int j = 0; j < strs.length; j++) {
                strs[j].charAt(i);
            }
        }

        return "";
    }
}
