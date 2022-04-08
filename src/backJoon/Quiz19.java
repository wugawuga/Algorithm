package backJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// SW expert 1989 초심자의 회문 검사
public class Quiz19 {

    public static int solution(String s) {

        String tmp = new StringBuilder(s).reverse().toString();
        if (tmp.equals(s)) {
            return 1;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            sb.append("#").append(i + 1).append(" ").append(solution(s)).append("\n");
        }
        System.out.println(sb);
    }
}
