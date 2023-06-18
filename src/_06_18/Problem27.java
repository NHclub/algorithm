package _06_18;

public class Problem27 {
    public double solution(double num) {
        if (num == 1){
            return 0;
        }
        int answer = 0;
        int count = 0;
        while (num > 1) {
            if(num %2 == 0){
                num /= 2;
                count++;
            } else if (num % 2 == 1) {
                num = num * 3 + 1;
                count++;
            }
            if (count==500){
                return -1;
            }
        }

        return count;
    }
}
