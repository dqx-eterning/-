public class offer05替换空格 {
    public static void main(String[] args) {
        String s = "we are friends";
        System.out.println(replaceSpace(s));
    }
    public static String replaceSpace(String s) {
       //return s.replaceAll(" ","%20");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' '){
                stringBuilder.append("%20");
            }else {
                stringBuilder.append(s.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
