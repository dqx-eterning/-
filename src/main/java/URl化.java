

public class URl化 {
    public static void main(String[] args) {
        String s = "  you 数组拆分   vf      ";
        System.out.println(replaceSpaces1(s,14));
    }

    private static String replaceSpaces(String s, int length) {

        char[] cs = new char[length*3];
        int i=0;
        int j=0;
        char c;
        while (i<length){
            c = s.charAt(i);
            if (c ==  ' '){
                cs[j++] = '%';
                cs[j++] = '2';
                cs[j++] = '0';
            }else{
                cs[j++] = c;
            }
            i++;
        }
        return new String(cs,0,j);
    }


//    public static String replaceSpaces(String s,int length){
//        return s.substring(0,length).replace(" ","%20");
//    }

    private static String replaceSpaces1(String s, int length){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == ' '){
                sb.append("%20");
            }else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

}
