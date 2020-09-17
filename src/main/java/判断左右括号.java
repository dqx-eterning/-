
import java.util.Scanner;
import java.util.Stack;

public class 判断左右括号 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true){
            boolean  a = true;
            String s = scanner.nextLine();
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if (c == '('|| c == '[' || c == '{')  {
                        stack.add(c);
                }
                if (c == ')'){
                    if ( !stack.isEmpty()&&stack.peek() == '(' ){
                        stack.pop();
                    }else {
                        System.out.println("false");
                        a = false;
                        break;
                    }
                }
                if (c == ']'){
                    if (!stack.isEmpty() &&stack.peek() == '[' ){
                        stack.pop();
                    }else {
                        System.out.println("false");
                        a = false;
                        break;
                    }
                }
                if (c == '}'){
                    if (!stack.isEmpty() &&stack.peek() == '{' ){
                        stack.pop();
                    }else {
                        System.out.println("false");
                        a = false;
                        break;
                    }
                }
            }
            if (a){
                if (stack.isEmpty() ){
                    System.out.println("true");
                }else{
                    System.out.println("false");
                }
            }


        }

    }
}
