package backJoon;

import java.io.IOException;
import java.util.Scanner;

//https://www.acmicpc.net/problem/7568
public class Quiz23 {

    public static String solution(int n, int[][] arr) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n; j++) {
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    cnt++;
                }
            }
            sb.append(cnt).append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        System.out.println(solution(n, arr));
    }
}
