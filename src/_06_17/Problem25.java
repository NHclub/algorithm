package _06_17;

public class Problem25 {
    public double solution(double n) {
        double answer = 0;
        answer = Math.sqrt(n);
        if (answer % 1 == 0) {
            answer++;
            answer = answer * answer;
        }else{answer = -1;}

        return answer;
    }

    public static void main(String[] args) {
        Problem25 problem25 = new Problem25();
        problem25.solution(49);
    }
}
