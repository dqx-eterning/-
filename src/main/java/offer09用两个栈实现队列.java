import java.util.Deque;
import java.util.LinkedList;

public class offer09用两个栈实现队列 {
    class CQueue {
        LinkedList<Integer> stack1;
        LinkedList<Integer> stack2;
        public CQueue() {
            stack1 = new LinkedList<Integer>();
            stack2 = new LinkedList<Integer>();
        }

        public void appendTail(int value) {
            stack1.add(value);
        }

        public int deleteHead() {
            // 如果第二个栈为空
            if (stack2.isEmpty()){

                if (stack1.isEmpty()) return  -1;
                while (!stack1.isEmpty()){
                    stack2.add(stack1.pop());
                }
                return stack2.pop();
            }else return stack2.pop();
        }
    }

}
