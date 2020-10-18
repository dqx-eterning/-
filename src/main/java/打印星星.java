
public class 打印星星 {
    public static void main(String[] args) {

        printChars(15,2);
    }
    public static void printChars(int total,int step){
        int sum = 1;
        int sum1 = 0;
        int count = 0;
        int all = 0;
        while (all < total){
            count++;
            int a = sum;//上一次sum
            sum = sum + step;//本次sum
            all = sum + a;
            //System.out.println(all);
        }
        for (int i = 0; i < count; i++) {
           sum1 = sum1+(1+i*step);
        }
        int tag = sum1 - total;
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1+i*step;
        }
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < 1 + step * (count - 1)-arr[i]; j++) {
                System.out.print(" ");
            }
            if (i==count - 1){
                for (int j = 0; j < arr[i]-tag; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < tag; j++) {
                    System.out.print("?");
                }

            }else {
                for (int j = 0; j < arr[i]; j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
