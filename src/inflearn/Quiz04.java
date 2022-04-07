package inflearn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

// 인프런 연속부분수열(복합적 문제)
public class Quiz04 {

    public static int solution(int N, int M, int[] arr) {

        int answer = 0, sum = 0, lt = 0;
        for (int rt = 0; rt < N; rt++) {
            sum += arr[rt];
            if(sum == M) answer++;
            while (sum >= M) {
                sum -= arr[lt++];
                if (sum == M) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(N, M, arr));
    }
}