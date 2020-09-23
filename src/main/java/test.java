public class test {
    public static void main(String[] args) {
        String s = "abc";
        String s1 = "bc";
        System.out.println(indexOf(s,s1));
    }
    public static  int indexOf (String s, String pattern) {
        for (int i = 0; i < s.length(); i++) {
            if (i<= s.length() - pattern.length()){
                if (s.indexOf(pattern,i)>0){
                    i=s.indexOf(pattern,i);
                    return i;
                }
            }
        }
        return -1;
    }
}
