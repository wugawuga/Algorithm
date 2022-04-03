package backJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//https://www.acmicpc.net/problem/3273
public class Quiz06 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        String arrString = br.readLine();
        String[] brr = arrString.split(" ");
        int x = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < brr.length; i++) {
            arr[i] = Integer.parseInt(brr[i]);
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int sum = arr[i]+arr[j];
                if (sum == x) {
                    cnt++;
                } else if (sum > x) {
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}
