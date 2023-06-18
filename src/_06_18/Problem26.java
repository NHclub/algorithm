package _06_18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem26 {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            int[] answer = {-1};
            return answer;
        }
        int[] answer = new int[arr.length - 1];
        List<Integer> lsArr = new ArrayList<>();
        int index = 0;
        for (int i : arr) {
            lsArr.add(i);
        }
        Collections.sort(lsArr);
        int Min = lsArr.get(0);
        for (int i = 0; i < arr.length; i++) {
            if (Min == arr[i]){
                continue;
            }else{
                answer[index] = arr[i];
                index++;
            }

        }

        return answer;
    }
}
