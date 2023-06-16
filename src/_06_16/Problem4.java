package _06_16;

public class Problem4 {
    public long solution(int a, int b) {
        long answer = 0;
        if (a==b){
            answer = a;
        } else if (a < b) {
            while(a<=b){
                answer += a;
                a++;
            }
        } else if (a > b) {
            while(b<=a){
                answer += b;
                b++;
            }
        }

        return answer;
    }
}
