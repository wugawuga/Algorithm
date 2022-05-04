package backJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

//https://www.acmicpc.net/problem/1427
public class Quiz36 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();
        int[] arr = new int[N.length()];

        for (int i = 0; i < N.length(); i++) {
            arr[i] = Integer.parseInt(String.valueOf(N.charAt(i)));
        }
        Integer[] brr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(brr, Collections.reverseOrder());
        String answer = "";
        for (Integer integer : brr) {
            answer += integer;
        }
        System.out.println(answer);
    }
}
