package backJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/1718
public class Quiz21 {

    public static String solution(String og, String key) {

        String answer = "";
        while (!(og.length() <= key.length())) {
            key += key;
        }
        for (int i = 0; i < og.length(); i++) {
            if (og.charAt(i) == ' ') {
                answer += " ";
                continue;
            }
            if (og.charAt(i) <= key.charAt(i)) {
                char ans = (char) ('z' - (key.charAt(i) - og.charAt(i)));
                answer += ans;
            } else {
                char ans = (char) (og.charAt(i) - key.charAt(i) + 'a' - 1);
                answer += ans;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String og = br.readLine();
        String key = br.readLine();

        System.out.println(solution(og, key));
    }
}
