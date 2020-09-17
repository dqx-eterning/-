

public class 判断是否互为字符重排 {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "dcsa";
        boolean b = checkPermutation(s1, s2);
        System.out.println(b);
    }
    public static boolean checkPermutation(String s1,String s2){
        int length1 = s1.length();
        int length2 = s2.length();
        if (length1 != length2){
            return false;
        }
        int[] array = new int[128];
        for (int i=0;i<length1;i++){
            array[s1.charAt(i)]++;
            array[s2.charAt(i)]--;
        }
        for (int i : array) {
            if (i != 0){
                return false;
            }
        }
        return true;
    }
}

