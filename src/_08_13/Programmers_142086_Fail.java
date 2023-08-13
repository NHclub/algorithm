package _08_13;

import java.util.ArrayList;
import java.util.List;

public class Programmers_142086_Fail {
    public int[] solutions(String s){
        List<Character> isIncludeChar = new ArrayList();
        int[] answer = new int[s.length()];
        char isInclude;
        int noInclude;

        for (int i = 0; i < s.length(); i++) {
            isInclude = s.charAt(i);
            noInclude = s.indexOf(isInclude);
            if (noInclude == -1) {
                answer[i] = noInclude;
            }else{
                isIncludeChar.add(s.charAt(i));
            }
            if (isIncludeChar.contains(s.charAt(i))) {
//                isIncludeChar.remove()
            }
        }
        //마지막 발생 문자를 어떻게 저장해야 할 지.. 떠오르지 않음

        return answer;
    }

    public static void main(String[] args) {
        Programmers_142086_Fail programmers142086 = new Programmers_142086_Fail();
        programmers142086.solutions("banana");
    }
}

//    public int[] solutions(String s) {
//        int[] answer = new int[s.length()];
//        int[] lastOccurrence = new int[26]; // 알파벳 소문자에 대한 마지막 발생 위치
//
//        // 처음에는 모든 글자의 마지막 발생 위치를 -1로 초기화
//        for (int i = 0; i < 26; i++) {
//            lastOccurrence[i] = -1;
//        }
//
//        for (int i = 0; i < s.length(); i++) {
//            char currentChar = s.charAt(i);
//            int index = currentChar - 'a'; // 해당 문자에 대한 배열 인덱스 계산
//
//            // 해당 문자의 마지막 발생 위치가 없으면 -1, 그렇지 않으면 마지막 발생 위치에서 현재 위치까지의 거리
//            answer[i] = (lastOccurrence[index] == -1) ? -1 : i - lastOccurrence[index];
//
//            // 현재 위치를 마지막 발생 위치로 업데이트
//            lastOccurrence[index] = i;
//        }
//
//        return answer;
//    }
