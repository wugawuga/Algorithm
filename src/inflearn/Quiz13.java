package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 인프런 피보나치 재귀(메모이제이션)
public class Quiz13 {

    static int[] fibo;

    public int DFS(int N) {
        // 이 조건문 하나면 시간 단축
        if (fibo[N] > 0) {
            return fibo[N];
        }
        if (N == 1) {
            return fibo[N]=1;
        } else if (N == 2) {
            return fibo[N]=1;
        } else {
            return fibo[N] = DFS(N - 2) + DFS(N - 1);
        }
    }

    public static void main(String[] args) throws IOException {

        Quiz13 T = new Quiz13();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 피보나치 수열 N 항까지
        // 너무 느리다
//        for (int i = 1; i <= N; i++) {
//            System.out.print(T.DFS(i)+" ");
//        }

        // fibo 배열을 하나 만들어서 DFS 호출 할 때 바로 배열에 담아줌
        fibo = new int[N+1];
        T.DFS(N);
        for (int i = 1; i <= N; i++) {
            System.out.print(fibo[i]+" ");
        }
    }
}
