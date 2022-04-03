package backJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//https://www.acmicpc.net/problem/1181
public class Quiz08 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();
        String tmp = "";

        for (int i = 0; i < N; i++) {
            list.add(br.readLine());
        }

        Collections.sort(list, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {

                if(o1.length() == o2.length()){
                    return o1.compareTo(o2);
                }
                return o1.length() - o2.length();
            }
        });

        int i = 0;
        int j = 1;

        while (j != list.size()) {
            if (list.get(i).equals(list.get(j))) {
                list.remove(i);
                continue;
            }
            i++;
            j++;
        }
        for (String s : list) {
            sb.append(s).append("\n");
        }
        System.out.println(sb);
    }

}
