public class offer58左旋转字符串 {
    public static void main(String[] args) {
        String s = "abcdefg";
        String s1 = reverseLeftWords(s, 2);
        System.out.println(s1);
    }
    public static String reverseLeftWords(String s, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        String s1 = s.substring(0, n);
        String s2 = s.substring(n, s.length());
        return stringBuilder.append(s2).append(s1).toString();
    }
}
