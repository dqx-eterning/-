public class offer15二进制中1的个数 {
    public static void main(String[] args) {
        System.out.println(hammingWeight(011));
    }

    public  static int hammingWeight(int n) {
        if (n == 0){
            return 0;
        }
        int count = 0;
        while (n != 0 ){
            n = n&(n-1);
            count++;
        }
        return count;
    }
}
