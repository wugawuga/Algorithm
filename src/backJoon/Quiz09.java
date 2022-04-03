package backJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://www.acmicpc.net/problem/2470
public class Quiz09 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String[] arr = s.split(" ");
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(arr[i]));
        }

        Collections.sort(list);
        int i = 0;
        int j = list.size()-1;
        int min = Integer.MAX_VALUE;
        while (i < j) {
            if (Math.abs(list.get(i) + list.get(j)) < min) {
                min = Math.abs(list.get(i) + list.get(j));
                list.add(list.get(i));
                list.add(list.get(j));
            }
            if (list.get(i) + list.get(j) > 0) {
                j--;
            } else {
                i++;
            }
        }
        System.out.println(list.get(list.size()-2)+" "+list.get(list.size()-1));
    }
}
