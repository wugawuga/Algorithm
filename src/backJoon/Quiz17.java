package backJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// SW expert 10570 제곱 팰린드롬 수
public class Quiz17 {

    public static int solution(int A, int B) {

        int cnt = 0;
        for (int i = A; i <= B; i++) {
            String tmp = new StringBuilder(String.valueOf(i)).reverse().toString();
            if (tmp.equals(String.valueOf(i))) {
                if (Math.sqrt(i) % 1 == 0) {
                    int a = (int) Math.sqrt(i);
                    tmp = new StringBuilder(String.valueOf(a)).reverse().toString();
                    if (tmp.equals(String.valueOf(a))) {
                        cnt++;
                    }else{
                        continue;
                    }
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int A = Integer.parseInt(br.readLine());
            int B = Integer.parseInt(br.readLine());
            sb.append("#").append(i + 1).append(" ").append(solution(A, B)).append("\n");
        }
        System.out.println(sb);
    }
}
