package backJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//https://www.acmicpc.net/problem/5800
public class Quiz04 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr;
        int[] arrScore;
        int ban = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int scoreGap;

        for (int i = 0; i < ban; i++) {
            String banScore = br.readLine();
            arr = banScore.split(" ");
            arrScore = new int[Integer.parseInt(arr[0])];
            scoreGap = 0;
            for (int j = 0; j < arrScore.length; j++) {
                arrScore[j] = Integer.parseInt(arr[j + 1]);
            }
            Arrays.sort(arrScore);

            for (int j = 0; j < arrScore.length-1; j++) {
                scoreGap = Math.max(scoreGap, arrScore[j + 1] - arrScore[j]);
            }

            sb.append("Class ").append(i+1).append("\n")
                    .append("Max ").append(arrScore[arrScore.length-1]).append(", Min ").append(arrScore[0]).append(", Largest gap ")
                    .append(scoreGap).append("\n");
        }
        System.out.println(sb);
    }
}
