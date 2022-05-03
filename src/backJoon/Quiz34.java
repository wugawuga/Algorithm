package backJoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//https://www.acmicpc.net/problem/1966
class Print {

    int id;
    int priority;

    public Print(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

public class Quiz34 {

    public static int solution(int n, int m, int[] arr) {

        int answer = 0;
        Queue<Print> q = new LinkedList();
        for (int i = 0; i < n; i++) {
            q.offer(new Print(i, arr[i]));
        }
        while (!q.isEmpty()) {
            Print tmp = q.poll();
            for (Print x : q) {
                if (x.priority > tmp.priority) {
                    q.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if (tmp != null) {
                answer++;
                if (tmp.id == m) {
                    return answer;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            System.out.println(solution(n, m, arr));
        }
    }
}