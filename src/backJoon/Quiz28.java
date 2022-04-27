package backJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//https://www.acmicpc.net/problem/1406
public class Quiz28 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        int k = Integer.parseInt(br.readLine());

        Stack<Character> lt = new Stack<>();
        Stack<Character> rt = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            lt.push(s.charAt(i));
        }

        for (int i = 0; i < k; i++) {
            String[] arr = br.readLine().split(" ");
            switch (arr[0]) {
                case "L": // 커서 왼쪽으로 옮김
                    if (!lt.isEmpty()) {
                        rt.push(lt.pop());
                    }
                    break;
                case "D": // 커서 오른쪽으로 옮김
                    if (!rt.isEmpty()) {
                        lt.push(rt.pop());
                    }
                    break;
                case "B": // 커서 왼쪽에 문자 삭제:
                    if (!lt.isEmpty()) {
                        lt.pop();
                    }
                    break;
                case "P": // 커서 왼쪽에 문자 추가:
                    char $ = arr[1].charAt(0);
                    lt.push($);
                    break;
            }
        }
        while (!lt.isEmpty()) {
            sb.append(lt.pop());
        }
        sb.reverse();
        while (!rt.isEmpty()) {
            sb.append(rt.pop());
        }
        System.out.println(sb);
    }
}