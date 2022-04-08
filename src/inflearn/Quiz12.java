package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 인프런 팩토리얼
public class Quiz12 {

    public static int DFS(int N) {

        if (N == 1) {
            return 1;
        } else {
            return N * DFS(N - 1);
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        System.out.println(DFS(N));
    }
}
