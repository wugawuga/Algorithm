package backJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//https://www.acmicpc.net/problem/20291
public class Quiz03 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            String[] arr = s.split("\\.");
            if (map.containsKey(arr[1])) {
                map.replace(arr[1], map.get(arr[1]) + 1);
            } else {
                map.put(arr[1], 1);
            }
        }
        for (String s : map.keySet()) {
            sb.append(s).append(' ').append(map.get(s)).append('\n');
        }
        System.out.println(sb);

    }
}
