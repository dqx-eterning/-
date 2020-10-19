import java.util.Arrays;

public class example {
    public static void main(String[] args) {
       String s  = "1 0 3";
        //change(s);
        System.out.println(change(s));
    }
    public static  int change(String str){
        String s = str.replaceAll(" ", "");
        if (s.length()<3){
            return  0;
        }
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int a = s.charAt(i)-'0';
            arr[i] = a;
        }
        Arrays.sort(arr);
        int max = arr[arr.length-1]*100+arr[arr.length-2]*10+arr[arr.length-3]*1;
        int min = 0;
        if (arr[0] == 0){
             min = arr[1]*100+arr[2];
        }else {
             min = arr[0]*100+arr[1]*10+arr[3]*1;
        }
       /* System.out.println(max);
        System.out.println(min);*/
        return max-min;
    }
}
