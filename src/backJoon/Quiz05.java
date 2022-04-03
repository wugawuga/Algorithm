package backJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//https://www.acmicpc.net/problem/1764
public class Quiz05 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String db = br.readLine();
        String[] dbs = db.split(" ");

        // 배열 or 리스트로 반복문 돌리면서 비교하면 시간초과
        // Set으로 만들어서 contains 로 값 비교하면서!!!
        Set<String> peoples = new HashSet<>();
        List<String> answer = new ArrayList<>();

        int cnt = 0;
        for (int i = 0; i < Integer.parseInt(dbs[0]); i++) {
            peoples.add(br.readLine());
        }
        for (int i = 0; i < Integer.parseInt(dbs[1]); i++) {
            String bobo = br.readLine();
            if (peoples.contains(bobo)) {
                cnt++;
                answer.add(bobo);
            }
        }
        Collections.sort(answer);
        sb.append(cnt).append("\n");
        for (String s : answer) {
            sb.append(s).append("\n");
        }
        System.out.print(sb);
    }
}
