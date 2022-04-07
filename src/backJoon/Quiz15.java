package backJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/1439
public class Quiz15 {

    public static int solution(String s) {

        int z = 0;
        int o = 0;

        if (s.charAt(0) == '0') {
            z++;
        } else {
            o++;
        }

        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i-1) == '0') {
                if (s.charAt(i) == '1') {
                    o++;
                }
            }
            if (s.charAt(i - 1) == '1') {
                if (s.charAt(i) == '0') {
                    z++;
                }
            }
        }
        return Math.min(z,o);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        System.out.println(solution(s));
    }
}
