package backJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/10809
public class Quiz11 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();

        for (int i = 97; i <= 122; i++) {
            int index = s.indexOf(i);
            sb.append(index).append(" ");
        }
        System.out.println(sb);
    }
}