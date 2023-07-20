package _07_20;

import java.util.Scanner;

public class Boj11659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] number = new int[n];
        int[] sumNumber = new int[n + 1];

        for (int i = 0; i < n; i++) {
            number[i] = sc.nextInt();
        }
        sumNumber[0] = 0;  // 0번째 항목을 0으로 설정합니다.
        for (int i = 1; i <= n; i++) {
            sumNumber[i] = sumNumber[i - 1] + number[i - 1];
        }
        for (int i = 0; i < m; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            System.out.println(sumNumber[end] - sumNumber[start - 1]);
        }
    }
}
