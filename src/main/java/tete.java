import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class tete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num1 = scanner.next();
        String num2 = scanner.next();
        //System.out.println(num1 + "  "+num2);
       int index1 = num1.length()-1;
       int index2 = num2.length()-1;
       int carry = 0;
       StringBuilder stringBuilder = new StringBuilder();
       int temp1 = 0,temp2 = 0;
       int sum = 0;
       while (index1>=0 || index2>=0){
           if (index1<0){
               temp1=0;
           }else {
               temp1 = num1.charAt(index1--)-'0';
           }
           if (index2<0){
               temp2=0;
           }else {
               temp2 = num1.charAt(index2--)-'0';
           }
           sum=carry+temp1+temp2;
           stringBuilder.append(sum%10);
           carry=sum/10;
       }
       if (carry == 1){
           stringBuilder.append("1");
       }
        System.out.println(stringBuilder.reverse().toString());
    }
}
