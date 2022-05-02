package inflearn;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 인프런 교육과정설계
public class Quiz28 {

    public static String solution(String s, String n) {

        String answer = "YES";
        Queue<Character> q = new LinkedList<>();
        for (char x : s.toCharArray()) {
            if (q.contains(x)) {
                if (x != q.poll()) {
                    return "NO";
                }
            }
        }
        if (!q.isEmpty()) {
            return "NO";
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String n = sc.nextLine();
        System.out.println(solution(s, n));
    }
}
