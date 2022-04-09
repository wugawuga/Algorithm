package inflearn;

import java.util.Scanner;

// 인프런 암호(replace(), parseInt(String,2))
public class Quiz17 {

    public static String solution(int n, String s) {

        String answer = "";
        for (int i = 0; i < n; i++) {
            String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            answer += (char)num;
            s = s.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();

        System.out.println(solution(N, str));
    }
}
