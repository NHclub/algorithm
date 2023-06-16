public class Problem12 {
    public double solution(double price, double money, double count) {
        double answer = 0;
        double x = price;
            //price 가격을 count 만큼 곱하고 money 차감
        while (count > 0) {
            money -= price;
            price = price + x;
            count--;

        }
        if (money < 0) {
            answer = money * -1;
        } else {
            answer = 0;
        }
        return answer;
    }


    public static void main(String[] args) {
        Problem12 problem12 = new Problem12();
        problem12.solution(3, 20, 4);
    }
}
