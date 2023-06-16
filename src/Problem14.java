import java.util.ArrayList;
import java.util.Arrays;

public class Problem14 {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> suc = new ArrayList<>();

        for (int i : arr) {
            if (i % divisor == 0) {
                suc.add(i);
            }
        }
        int num = 0;
        int[] answer = new int[suc.size()];

        for (int i = 0; i < suc.size(); i++) {
            answer[i] = suc.get(i);
        }
        Arrays.sort(answer);
        if (suc.size()==0){
            answer = new int[1];
            answer[0] = -1;

        }

        return answer;
    }

    public static void main(String[] args) {
        Problem14 problem14 = new Problem14();
        int[] a = {1};
        problem14.solution(a, 1);

    }
}
