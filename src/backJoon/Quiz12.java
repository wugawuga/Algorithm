package backJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/2941
public class Quiz12 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'c' && i < s.toCharArray().length - 1) {
                if (s.charAt(i+1) == '=' || s.charAt(i+1) == '-') {
                    i++;
                }
            } else if (s.charAt(i) == 'd' && i < s.toCharArray().length - 1) {
                if (s.charAt(i+1) == 'z' && i < s.toCharArray().length - 2) {
                    if (s.charAt(i+2) == '=') {
                        i += 2;
                    }
                } else if (s.charAt(i+1) == '-') {
                    i++;
                }
            } else if (s.charAt(i) == 'l' && i < s.toCharArray().length - 1) {
                if (s.charAt(i+1) == 'j') {
                    i++;
                }
            } else if (s.charAt(i) == 'n' && i < s.toCharArray().length - 1) {
                if (s.charAt(i+1) == 'j') {
                    i++;
                }
            } else if (s.charAt(i) == 's' && i < s.toCharArray().length - 1) {
                if (s.charAt(i+1) == '=') {
                    i++;
                }
            } else if (s.charAt(i) == 'z' && i < s.toCharArray().length - 1) {
                if (s.charAt(i+1) == '=') {
                    i++;
                }
            }
            cnt++;
        }

        System.out.println(cnt);
    }
}
