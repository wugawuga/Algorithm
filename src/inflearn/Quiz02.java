package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

// 인프런 공통원소구하기(two pointers algorithm)
public class Quiz02 {

    public static ArrayList<Integer> solution(int N, int M, int[] arr1, int[] arr2) {

        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int p1 = 0, p2 = 0;
        while (p1 < N && p2 < M) {
            if (arr1[p1] == arr2[p2]) {
                list.add(arr1[p1++]);
                p2++;
            } else if (arr1[p1] < arr2[p2]) {
                p1++;
            } else {
                p2++;
            }
        }
        return list;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr1 = new int[N];
        for (int i = 0; i < N; i++) {
            arr1[i] = Integer.parseInt(br.readLine());
        }

        int M = Integer.parseInt(br.readLine());
        int[] arr2 = new int[M];
        for (int i = 0; i < M; i++) {
            arr2[i] = Integer.parseInt(br.readLine());
        }

        for (int i : solution(N, M, arr1, arr2)) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}