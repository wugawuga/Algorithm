package backJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

// https://www.acmicpc.net/problem/2002
public class Quiz26 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> start = new HashMap<>();
        int x = Integer.parseInt(br.readLine());
        for (int i = 0; i < x; i++) {
            start.put(br.readLine(), i);
        }
        String[] end = new String[x];
        int cnt = 0;
        for (int i = 0; i < x; i++) {
            end[i] = br.readLine();
        }
        for (int i = 0; i < x; i++) {
            for (int j = i + 1; j < x; j++) {
                if (start.get(end[i]) > start.get(end[j])) {
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}
