package _06_20;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Problem31 {
    public int[] solution(int []arr) {
        Deque<Integer> number = new ArrayDeque<>();
        number.add(arr[0]);
        for (int i = 0; i < arr.length-1; i++) {
            if(number.pollLast() != arr[i]){
                number.add(arr[i]);
            }
        }
        int[] answer = new int[number.size()];
        for(int i=0; i< number.size(); i++){
            answer[i] = number.peek();

        }



        return answer;
    }

    public static void main(String[] args) {
        Problem31 problem31 = new Problem31();
        int[] num = {1, 1, 3, 3, 0, 1, 1};
        problem31.solution(num);

    }
}
