package _06_17;

public class Problem21_fail {
    public String solution(String s) {
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((int) s.charAt(i) == 32) {
                index = 0;
                continue;
            }
            if (index % 2 == 0) {
                char c = s.charAt(i);
                c = Character.toUpperCase(c);
                s = s.replace(s.charAt(i),c);
            }
            if (index % 2 == 1) {
                char c = s.charAt(i);
                c = Character.toLowerCase(c);
                s = s.replace(s.charAt(i),c);
            }
            index++;
        }


        String answer = s;
        return answer;
    }

    public static void main(String[] args) {
        Problem21_fail problem21 = new Problem21_fail();
        String s = "try hello world";
        problem21.solution(s);


    }
}
