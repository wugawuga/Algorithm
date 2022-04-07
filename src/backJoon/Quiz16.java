package backJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//https://www.acmicpc.net/problem/1316
public class Quiz16 {

    public static int solution(String[] arr) {

        int cnt = arr.length;

        for (String s : arr) {
            int[] brr = new int[26];
            Arrays.fill(brr, 0);
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i - 1) != s.charAt(i)) {
                    if (brr[s.charAt(i)-'a'] != 0) {
                        cnt--;
                        break;
                    }
                    brr[s.charAt(i-1)-'a']++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }
        System.out.println(solution(arr));
    }
}