package backJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//https://www.acmicpc.net/problem/11899
public class Quiz30 {

    public static int solution(String s) {

        Stack<Character> stack = new Stack<>();
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.add(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    cnt++;
                } else stack.pop();
            }
        }
        if (!stack.isEmpty()) {
            cnt += stack.size();
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        System.out.println(solution(s));
    }
}
