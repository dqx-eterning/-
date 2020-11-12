package likou;

import java.util.ArrayList;
import java.util.List;

public class 括号生成22 {
    public static void main(String[] args) {
        List<String> list = new 括号生成22().generateParenthesis1(3);
        System.out.println(list);
    }
    public List<String> generateParenthesis(int n) {
        List<String> combinations = new ArrayList<String>();
        generateAll(new char[2 * n], 0, combinations);
        return combinations;
    }

    public void generateAll(char[] current, int pos, List<String> result) {
        if (pos == current.length) {
            if (valid(current)) {
                result.add(new String(current));
            }
        } else {
            current[pos] = '(';
            generateAll(current, pos + 1, result);
            current[pos] = ')';
            generateAll(current, pos + 1, result);
        }
    }

    public boolean valid(char[] current) {
        int balance = 0;
        for (char c: current) {
            if (c == '(') {
                ++balance;
            } else {
                --balance;
            }
            if (balance < 0) {
                return false;
            }
        }
        return balance == 0;
    }

    //dfs简洁算法
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis1(int n) {
        dfs(n, n, "");
        return res;
    }
    private void dfs(int left, int right, String curStr) {
        if (left == 0 && right == 0){
            res.add(curStr);
            return;
        }

        if (left > 0) { // 如果左括号还剩余的话，可以拼接左括号
            dfs(left - 1, right, curStr + "(");
        }
        if (right > left) { // 如果右括号剩余多于左括号剩余的话，可以拼接右括号
            dfs(left, right - 1, curStr + ")");
        }
    }

}
