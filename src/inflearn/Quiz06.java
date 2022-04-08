package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 인프런 연속된 자연수의 합(수학)
public class Quiz06 {

    public static int solution(int N) {

        int answer = 0, cnt = 1;
        N--;
        while (N > 0) {
            cnt++;
            N = N - cnt;
            if (N % cnt == 0) {
                answer++;
            }
        }
        
        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        System.out.println(solution(N));
    }
}
