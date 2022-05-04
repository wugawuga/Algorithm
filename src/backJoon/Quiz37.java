package backJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

//https://programmers.co.kr/learn/courses/30/lessons/17680
public class Quiz37 {

    public static int solution(int cacheSize, String[] arr) {

        int answer = 0;
        Queue<String> cache = new LinkedList<>();

        // 캐시 크기가 0이면 항상 5초임
        if (cacheSize == 0) {
            return arr.length * 5;
        }

        for (int i = 0; i < arr.length; i++) {
            String city = arr[i];

            if (!cache.contains(city)) { // 캐시 miss
                answer = answer + 5;
                if (cache.size() == cacheSize) {
                    cache.poll();
                }
            } else { // 캐시 hit
                answer = answer + 1;
                cache.remove(city);
            }
            cache.add(city);
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cache = Integer.parseInt(br.readLine());
        String[] arr = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        System.out.println(solution(cache, arr));
    }
}
