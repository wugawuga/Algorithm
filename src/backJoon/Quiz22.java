package backJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/10820
public class Quiz22 {

    public static String solution(String s) {

        String answer = "";
        int dae = 0;
        int so = 0;
        int num = 0;
        int gong = 0;
        for (int i = 0; i < s.length(); i++) {
            if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
                so++;
            }
            if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
                dae++;
            }
            if ('0' <= s.charAt(i) && s.charAt(i) <= '9') {
                num++;
            }
            if (s.charAt(i) == ' ') {
                gong++;
            }
        }
        answer = so + " " + dae + " " + num + " " + gong;
        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = "";
        while ((s = br.readLine()) != null) {
            sb.append(solution(s)).append("\n");
        }
        System.out.println(sb);
    }
}
