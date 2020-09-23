import java.util.Random;

/*基本的数为2，和3，尽量分解成3，就可以获取最大*/
public class offer14剪绳子2 {
    public static void main(String[] args) {
        System.out.println(cuttingRope(8));
    }
    public static int cuttingRope(int n) {
        if(n == 2)
            return 1;
        if(n == 3)
            return 2;
        long res = 1;
        while(n > 4){
            res *= 3;
            res = res % 1000000007;
            n -= 3;
        }
        return (int)(res * n % 1000000007);

    }
}

