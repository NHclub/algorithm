package _06_16;

public class Problem6 {
    public int solution(int[] numbers) {

        int[] sum = new int[10];
        int answer = 0;

        for (int i = 0; i < 10; i++) {
            sum[i] = i;
        }
        for (int i : numbers) {
            sum[i] = 0;
        }
        for (int i = 0; i < 10; i++) {
            answer += sum[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem6 problem6 = new Problem6();
        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};
        problem6.solution(numbers);
    }
}
