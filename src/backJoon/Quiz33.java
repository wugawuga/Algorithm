package backJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//https://www.acmicpc.net/problem/10799
public class Quiz33 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        Stack<Character> stk = new Stack<>();

        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stk.push(c);
            }else {
                stk.pop();
                if (s.charAt(i - 1) == '(') {
                    cnt += stk.size();
                }else
                    cnt++;
            }
        }
        System.out.println(cnt);
    }
}
