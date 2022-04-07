package backJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/17413
public class Quiz14 {

    public static StringBuilder solution(String str) {

        StringBuilder sb = new StringBuilder();
        StringBuilder temp;
        int cnt = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '<') {
                temp = new StringBuilder(str.substring(cnt + 1, i));
                sb.append(temp.reverse());

                while (str.charAt(i) != '>')
                    sb.append(str.charAt(i++));

                cnt = i;
                sb.append(str.charAt(i));
            }
            if (str.charAt(i) == ' ') {
                if (cnt + 1 == i) {
                    sb.append(str.charAt(i));
                    cnt = i;
                }
                else {
                    temp = new StringBuilder(str.substring(cnt + 1, i));
                    sb.append(temp.reverse());
                    sb.append(str.charAt(i));
                    cnt = i;
                }
            }
        }
        temp = new StringBuilder(str.substring(cnt+1));

        return sb.append(temp.reverse());
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        System.out.println(solution(s));
    }
}
