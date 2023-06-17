package _06_17;

public class Problem17 {
    public boolean solution(String s) {
        boolean answer = true;

        if (s.length() ==4 || s.length() ==6)  {
            for (int i = 0; i < s.length(); i++) {
                if ((int) s.charAt(i) <58 ) {
                    answer = true;
                } else {
                    answer = false;
                    break;
                }

            }
        }else {
            answer =false;
        }
        return answer;
    }
}
