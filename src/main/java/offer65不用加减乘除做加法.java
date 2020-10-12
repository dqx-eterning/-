import java.util.Arrays;

public class offer65不用加减乘除做加法 {
    public static void main(String[] args) {
        System.out.println(add(1,2));
    }
    public static int sum(int...a){
        return Arrays.stream(a).sum();
    }
    public  static int add(int a, int b) {
        return sum(a,b);
    }

}
