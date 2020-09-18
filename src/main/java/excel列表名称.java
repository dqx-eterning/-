
public class excel列表名称 {
    public static void main(String[] args) {
        String s = convertToTitle(53);
        System.out.println(s);
    }

    public static String convertToTitle(int n) {
        StringBuilder string = new StringBuilder();
        String s = null;
        if (n <= 0) {
            return null;
        }
        while (n>0){
            n--;
            s = string.insert(0,(char) ('A' + n % 26)).toString();
            n = n/26;
        }
        return s;
    }
}
