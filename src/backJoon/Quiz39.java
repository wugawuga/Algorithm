package backJoon;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//https://www.acmicpc.net/problem/10867
public class Quiz39 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }
        for (Integer integer : set) {
            sb.append(integer).append(" ");
        }
        System.out.println(sb);
    }
}
