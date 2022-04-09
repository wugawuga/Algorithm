package backJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://programmers.co.kr/learn/courses/30/lessons/60057
public class Quiz20 {

    public static int solution(String s) {

        int answer = s.length();

        if (s.length() == 1) {
            return 1;
        }

        for (int i = 1; i < s.length()/2+1; i++) {

            String og = s.substring(0, i);
            int cnt = 1;
            String k = "";
            for (int j = i; j < s.length(); j += i) {
                int maxLen = j + i;
                if (maxLen >= s.length()) {
                    maxLen = s.length();
                }
                String compOg = s.substring(j, maxLen);
                if (og.equals(compOg)) {
                    cnt++;
                } else {
                    if (cnt == 1) {
                        k += og;
                    } else {
                        k += cnt + og;
                    }
                    cnt = 1;
                    og = compOg;
                }
            }
            if (cnt == 1) {
                k += og;
            } else {
                k += cnt + og;
            }
            answer = Math.min(answer, k.length());
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(solution(s));
    }
}