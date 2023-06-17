package _06_17;

public class Problem23 {
    public int[] solution(long n) {
        int index = 0;
        String[] num = String.valueOf(n).split("");
        int[] answer = new int[num.length];
        for (int i = num.length - 1; i >= 0; i--) {
            answer[index] = Integer.parseInt(num[i]);
            index++;
        }
        return answer;
    }

}
