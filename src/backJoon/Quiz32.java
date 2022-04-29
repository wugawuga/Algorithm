package backJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

//https://www.acmicpc.net/problem/1158
public class Quiz32 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Queue<Integer> qu = new ArrayDeque<>();

        String[] arr = br.readLine().split(" ");

        int n = Integer.parseInt(arr[0]);
        int k = Integer.parseInt(arr[1]);

        for (int i = 1; i <= n; i++) {
            qu.offer(i);
        }
        while (qu.size() != 1) {
            for (int i = 1; i < k; i++) {
                qu.offer(qu.poll());
            }
            sb.append(qu.poll()).append(", ");
        }
        sb.append(qu.poll()).append(">");
        System.out.println("<"+sb);
    }
}