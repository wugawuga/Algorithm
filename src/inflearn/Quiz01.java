package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// 인프런 두 배열 합치기(two pointers algorithm)
public class Quiz01 {

    public static ArrayList<Integer> solution(int N, int M, int[] arr1, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1 < N && p2 < M) {
            if (arr1[p1] < arr2[p2]) {
                list.add(arr1[p1++]);
            } else {
                list.add(arr2[p2++]);
            }
        }
        while (p1 < N) {
            list.add(arr1[p1++]);
        }
        while (p2 < M) {
            list.add(arr2[p2++]);
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