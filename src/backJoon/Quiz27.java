package backJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//https://www.acmicpc.net/problem/1918
public class Quiz27 {

    public static String solution(String s) {

        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char k = s.charAt(i);
            if (k == '+' || k == '-' || k == '*' || k == '/') {
                boolean ff = true;
                while (ff) {
                    if (stack.isEmpty() || stack.peek() == '(' ||
                            ((k == '*' || k == '/') && (stack.peek() == '+' || stack.peek() == '-'))) {
                        stack.push(k);
                        break;
                    } else {
                        sb.append(stack.pop());
                    }
                }
            } else if(k == '(') {
                stack.push(k);
            } else if(k == ')') {
                boolean ff = true;
                while (ff) {
                    char out = stack.pop();
                    if (out == '(') {
                        break;
                    } else {
                        sb.append(out);
                    }
                }
            } else {
                sb.append(k);
            }
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        System.out.println(solution(s));
    }
}
