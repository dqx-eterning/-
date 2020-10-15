public class offer10青蛙跳台阶 {
    public static void main(String[] args) {
        System.out.println(numWays(7));
    }
    public static int numWays(int n) {
        if (n==1 || n== 0) return 1;
        int[] arr = new int[n+1];
        arr[1] = 1;
        arr[2] = 2;
        for (int i = 3; i <= n ; i++) {
            arr[i] = (arr[i-1]+arr[i-2]) % 1000000007;
        }
        return arr[n];
    }
}
