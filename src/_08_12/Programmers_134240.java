package _08_12;

public class Programmers_134240  {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            int halfAmount = food[i] / 2;
            for (int j = 0; j < halfAmount; j++) {
                answer.append(i);
            }
        }

        answer.append("0");

        for (int i = food.length - 1; i > 0; i--) {
            int halfAmount = food[i] / 2;
            for (int j = 0; j < halfAmount; j++) {
                answer.append(i);
            }
        }

        return answer.toString();
    }

}
//    조금 더 간결하고 직관적
//    public String solution(int[] food) {
//        StringBuilder left = new StringBuilder(); // 왼쪽 선수가 먹을 음식 배치
//        StringBuilder right = new StringBuilder(); // 오른쪽 선수가 먹을 음식 배치
//
//        for (int i = 1; i < food.length; i++) {
//            int halfAmount = food[i] / 2; // 각 음식을 반으로 나눔
//            char foodChar = (char) ('0' + i); // 해당 음식의 문자 표현
//
//            // 왼쪽 선수와 오른쪽 선수에게 동일한 양의 음식 배치
//            for (int j = 0; j < halfAmount; j++) {
//                left.append(foodChar);
//                right.insert(0, foodChar);
//            }
//        }
//
//        return left.append("0").append(right).toString(); // 왼쪽, 물, 오른쪽 선수의 음식 배치를 합침
//    }
