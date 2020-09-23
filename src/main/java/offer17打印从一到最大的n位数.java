

public class offer17打印从一到最大的n位数 {
    public static void main(String[] args) {
        int[] ints = printNumbers(2);
        for (int anInt : ints) {
            System.out.print(anInt);
        }
    }
    public static int[] printNumbers(int n) {
        double pow = Math.pow(10, n);
        int a = new Double(pow).intValue() - 1;
        System.out.println(a);
       int[] arr = new int[a];
        if (n<= 0){
            return new int[0];
        }else{
            for (int i = 1; i <= a; i++) {
                arr[i-1] = i;
            }
        }
        return arr;
    }

}
