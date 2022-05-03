package backJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// 프로그래머스 다리를 지나는 트럭
public class Quiz35 {

    public static int solution(int bridge_length, int weight, int[] truck_weights) {

        int answer = 0;
        Queue<Integer> start = new LinkedList<>();
        for (int x : truck_weights) {
            start.offer(x);
        }
        Queue<Integer> now = new LinkedList<>();
        Queue<Integer> end = new LinkedList<>();
        int nowWeight = 0;
        while (start.size() > 0 || now.size() > 0) { // 대기중이거나 지나는 트럭이 존재할 경우만
            if (!end.isEmpty()) {
                if (answer == end.peek() + bridge_length) {
                    nowWeight -= now.peek();
                    now.poll();
                    end.poll();
                }
            }
            if (!start.isEmpty()) {
                if (nowWeight + start.peek() <= weight) {
                    nowWeight += start.peek();
                    now.offer(start.poll());
                    end.offer(answer);
                }
            }
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int bridge_length = Integer.parseInt(br.readLine());
        int weight = Integer.parseInt(br.readLine());
        int[] truck_weights = {7, 4, 5, 6};
        int[] truck_weights1 = {10};
        int[] truck_weights2 = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        System.out.println(solution(bridge_length, weight, truck_weights2));
    }
}
