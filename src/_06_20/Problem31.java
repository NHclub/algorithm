package _06_20;

import java.util.ArrayDeque;
import java.util.Deque;

public class Problem31 {
    public int[] solution(int []arr) {
        Deque<Integer> number = new ArrayDeque<>();
        number.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1] != arr[i]){
                number.add(arr[i]);
            }
        }

        int[] answer = new int[number.size()];

        for(int i=0; i< answer.length; i++){
            answer[i] = number.pollFirst();
        }

        return answer;
    }

}
