package _07_15;

import java.util.Scanner;

public class Boj1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] score = new int[n];
        double max = 0;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (score[i] > max) {
                max = score[i];
            }
        }

        for (int i = 0; i < n; i++) {
            sum += score[i]/max*100;
        }

        System.out.println(sum/n);

    }
}