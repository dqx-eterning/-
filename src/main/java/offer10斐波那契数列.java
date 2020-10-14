public class offer10斐波那契数列 {

    public static void main(String[] args) {

    }

    //求斐波那契数列第n个数
    public static int fib(int n) {
        if (n == 0 || n == 1)
            return n;

        int a = 1, b = 0;
        for (int i = 1; i < n; i++) {
            //两次变换后，b为上一次的a
            a = a + b;
            b = a - b;
            a %= 1000000007;
            /*
            //两次变换后，b为上一次的a，也可以变成如下
            int tep = a;
            a = a + b;
            b = tep;
            a %= 1000000007;*/
        }
        return a;

    }
}
