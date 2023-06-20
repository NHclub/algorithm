package _06_20;

public class Problem30 {
    public int solution(int[][] sizes) {
        int answer=0;
        int max=0;
        int min=0;

        for (int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] < sizes[i][1]){
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
            if(sizes[i][0]>max){
                max=sizes[i][0];
            }
            if(sizes[i][1]>min){
                min=sizes[i][1];
            }
        }
        //{{60,50}, {70,30}, {60,30}, {80,40}};
        answer=max*min;
        return answer;
    }

}
