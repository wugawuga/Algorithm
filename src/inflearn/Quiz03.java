package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 인프런 최대 매출(Sliding window)
public class Quiz19 {

    public static int solution(int N, int K, int[] arr) {

        int answer = 0, sum = 0;
        for (int i = 0; i < K; i++) sum += arr[i];
        answer = sum;
        for (int i = K; i < N; i++) {
            sum += (arr[i] - arr[i - K]);
            answer = Math.max(answer, sum);
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(solution(N, K, arr));
    }
}
