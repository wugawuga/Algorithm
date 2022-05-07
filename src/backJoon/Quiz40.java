package backJoon;

import java.util.ArrayList;

//https://programmers.co.kr/learn/courses/30/lessons/42746
public class Quiz40 {

    public static void main(String[] args) {

        int[] arr = {3, 30, 34, 5, 9};
        int[] brr = {6, 10, 2};
        ArrayList<String> crr = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            crr.add(String.valueOf(arr[i]));
        }
        String answer = "";
        for (int i = 0; i < crr.size() - 1; i++) {
            for (int j = i + 1; j < crr.size(); j++) {
                if (Integer.parseInt(crr.get(i) + crr.get(j))
                        < Integer.parseInt(crr.get(j) + crr.get(i))) {
                    answer += Integer.parseInt(crr.get(j) + crr.get(i));
                }
            }
        }
        System.out.println(answer);
    }
}
