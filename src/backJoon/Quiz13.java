package backJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/1157
public class Quiz13 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        s = s.toUpperCase();

        int[] aa = new int[26];
        int max = 0;
        char c = '?';

        for (int i = 0; i < s.length(); i++) {
            aa[s.charAt(i)-65]++;
            if (max < aa[s.charAt(i) - 65]) {
                max = aa[s.charAt(i)-65];
                c = s.charAt(i);
            } else if (max == aa[s.charAt(i) - 65]) {
                c = '?';
            }
        }
        System.out.println(c);
    }
}