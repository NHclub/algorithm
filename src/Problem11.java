public class Problem11 {
    public double[] solution(double x, int n) {
        double[] answer = new double[n];
        double val = x;

        for (int i = 0; i < n; i++) {

            answer[i] = x;
            x += val;
        }
        return answer;
    }
    public static void main(String[] args) {
        Problem11 problem11 = new Problem11();

        problem11.solution(0, 9);

    }

}
