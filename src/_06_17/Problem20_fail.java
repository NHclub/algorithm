package _06_17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem20_fail {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        //List<Integer> index = new ArrayList<>();
        List<String> list = new ArrayList<String>(Arrays.asList(participant));

        for (int i = 0; i < completion.length; i++) {
            for (int j = 0; j < list.size(); j++)
                if (completion[i].equals(list.get(j))) {
                    list.remove(j);
                    continue;
            }
        }
//        for (int i : index) {
//            list.remove(i);
//        }

        answer = list.get(0);
        return answer;
    }

    public static void main(String[] args) {
        Problem20_fail problem20 = new Problem20_fail();
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        problem20.solution(participant, completion);
    }
}
