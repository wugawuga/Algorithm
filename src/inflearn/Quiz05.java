package inflearn;

import java.util.Scanner;

// 인프런 연속된 자연수의 합(two pointers)
public class Quiz05 {

    public static int solution(int n) {

        int cnt = 0, sum = 0, lt = 0;
        int r = n/2 + 1;
        int[] arr = new int[r];
        for(int i = 0; i < r; i++){
            arr[i] = i+1;
        }
        for(int rt = 0; rt < r; rt++){
            sum += arr[rt];
            if (sum == n) {
                cnt++;
            }
            while (sum >= n) {
                sum -= arr[lt++];
                if (sum == n) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(solution(N));
    }
}
