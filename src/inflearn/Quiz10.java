package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 인프런 재귀함수(스택프레임)
public class Quiz10 {

    public static void DFS(int N) {

        if (N == 0) {
            return;
        } else {
            DFS(N - 1);
            System.out.print(N+" ");
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        DFS(N);
    }
}
