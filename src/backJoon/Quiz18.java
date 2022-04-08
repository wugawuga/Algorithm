package backJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/17609
public class Quiz18 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());
        First:
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            StringBuilder sb = new StringBuilder(s);
            if (s.equals(sb.reverse().toString())) {
                System.out.println("0");
                continue;
            }
            Second:
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) != s.charAt(s.length() - 1 - j)) {
                    StringBuilder sb1 = new StringBuilder(s).deleteCharAt(j);
                    StringBuilder sb2 = new StringBuilder(s).deleteCharAt(s.length()-1-j);

                    if (sb1.toString().equals(sb1.reverse().toString()) ||
                            sb2.toString().equals(sb2.reverse().toString())) {
                        System.out.println("1");
                        continue First;
                    } else {
                        break;
                    }
                }
            }
            System.out.println("2");
        }
    }
}
