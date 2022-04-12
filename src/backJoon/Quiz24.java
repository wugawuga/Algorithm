package backJoon;

//https://www.acmicpc.net/problem/10871
import java.util.Scanner;

public class Quiz24 {

    public static String solution(int n, int x, int[] arr) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (arr[i] < x) {
                sb.append(arr[i]).append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n, x, arr));
    }
}
