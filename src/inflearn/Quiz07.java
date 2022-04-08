package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

// 인프런 회문 문자열
public class Quiz07 {

    public static String solution(String n) {

        String answer = "YES";
        int len = n.length();
        n = n.toUpperCase(Locale.ROOT);
        for (int i = 0; i < len / 2; i++) {
            if (n.charAt(i) != n.charAt(len - 1 - i)) {
                return "NO";
            }
        }
        return answer;
    }

    public static String solution1(String n) {

        String answer = "NO";
        String tmp = new StringBuilder(n).reverse().toString();
        if (n.equals(tmp)) {
            return "YES";
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();

        System.out.println(solution(n) + " " + solution1(n));
    }
}
