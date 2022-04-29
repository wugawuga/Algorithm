package backJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

//https://www.acmicpc.net/problem/2164
public class Quiz31 {

    public static int solution(int x) {

        Queue<Integer> qu = new ArrayDeque<>();

        for (int i = 1; i <= x; i++) {
            qu.offer(i);
        }

        while (qu.size() != 1) {
            qu.poll();
            qu.offer(qu.poll());
        }
        return qu.poll();
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());

        System.out.println(solution(x));
    }
}