import java.util.ArrayList;
import java.util.List;

public class offer58反转单词顺序 {
    public static void main(String[] args) {
        String s = " the sky is blue! ";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        String[] strings = s.split(" ");
        List<String> list = new ArrayList<>();
        for (String string : strings) {
            if (!string.equals("")){
                list.add(string);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = list.size()-1; i >=0 ; i--) {
                StringBuilder append = stringBuilder.append(list.get(i));
                if (i != 0 ){
                    append.append(" ");
                    }
                }

        return  stringBuilder.toString();
    }
}
