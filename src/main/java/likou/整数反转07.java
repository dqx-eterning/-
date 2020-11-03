package likou;

public class 整数反转07 {
    public static void main(String[] args) {
        System.out.println(reverse1(-312));
    }
    public static int reverse(int x) {
        long n = 0;
        while(x != 0) {
            n = n*10 + x%10;//非常巧妙
            x = x/10;
        }
        return (int)n==n? (int)n:0;
    }
    //自己的想法
    public static  int reverse1(int x) {
        String s = Integer.toString(x);
        StringBuilder sb;
        if (x < 0){
            try {
                sb = new StringBuilder(s.substring(1));
                int parse = Integer.parseInt(sb.reverse().toString());
                return 0-parse;
            } catch (NumberFormatException e) {
               return  0;
            }
        }else{
            try {
                sb = new StringBuilder(s);
                int parse = Integer.parseInt(sb.reverse().toString());
                return  parse;
            } catch (NumberFormatException e) {
               return  0;
            }
        }
    }
}
