import java.awt.image.Raster;

public class 赎金信 {
    public static void main(String[] args)  {
        String s1 = "aa";
        String s2 = "ab";
        System.out.println(canConstruct(s1,s2));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] map = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            map[magazine.charAt(i)-'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
           if (map[ransomNote.charAt(i)-'a'] > 0){
               map[ransomNote.charAt(i)-'a']--;
           }else {
               return false;
           }
        }
        return true;
    }
}
