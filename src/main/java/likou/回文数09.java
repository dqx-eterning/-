package likou;

public class 回文数09 {
    public static void main(String[] args) {
        System.out.println(isPalindrome1(121));
    }
    public static boolean isPalindrome(int x) {
        if (x < 0 ){
            return false;
        }
        String s = Integer.toString(x);
        String s1 = new StringBuilder(s).reverse().toString();
        if (s.equals(s1)){
            return true;
        }
        return false;
    }
    public static boolean isPalindrome1(int x) {
        if (x < 0 ){
            return false;
        }
        int temp = x;
        int revs = 0;
        while (x != 0){
            revs = revs * 10 + x%10;
            x = x / 10;
        }
        return  temp == revs;
    }
}
