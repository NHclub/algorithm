package _06_17;

public class Problem22 {
    public int solution(int n) {
        int answer = 0;
        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }


    public static void main(String[] args) {
        Problem22 problem22 = new Problem22();
        problem22.solution(123);
    }
}
