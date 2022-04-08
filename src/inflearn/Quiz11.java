package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 인프런 이진수 출력(재귀)
public class Quiz11 {

    public static void DFS(int N) {

        if (N == 0) {
            return;
        } else {
            DFS(N / 2);
            System.out.print(N%2);
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        if (N == 0) {
            System.out.println(0);
        } else {
            DFS(N);
        }
    }
}
