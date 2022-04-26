package backJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

// https://www.acmicpc.net/problem/6996
public class Quiz25 {

    public static String solution(String n) {

        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        String[] arr = n.split(" ");
        sb.append(arr[0]).append(" & ").append(arr[1]).append(" are ");
        for (char s : arr[0].toCharArray()) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (char s : arr[1].toCharArray()) {
            map.put(s, map.getOrDefault(s, 0) - 1);
        }
        for (int i = 0; i < map.size(); i++) {
            int x = map.get(arr[0].charAt(i));
            if (x != 0) {
                return sb.append("NOT anagrams.\n").toString();
            }
        }
        return sb.append("anagrams.\n").toString();
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        for (int i = 0; i < x; i++) {
            String n = br.readLine();
            System.out.print(solution(n));
        }
    }
}
