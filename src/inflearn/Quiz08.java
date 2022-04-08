package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

// 인프런 팰린드롬(replaceAll 정규식이용)
public class Quiz08 {

    public static String solution(String n) {

        String answer = "NO";
        n = n.toUpperCase(Locale.ROOT).replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(n).reverse().toString();
        if (n.equals(tmp)) {
            answer = "YES";
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();

        System.out.println(solution(n));
    }
}
