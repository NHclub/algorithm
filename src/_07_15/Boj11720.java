package _07_15;

import java.util.Scanner;

public class Boj11720 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String m = sc.next();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += m.charAt(i) - '0';
        }
        System.out.println(sum);
    }

}
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//
//class Main {
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        String str = br.readLine();
//        int ans = 0;
//        for(int i=0; i<N; i++)
//            ans += str.charAt(i) - '0';
//        System.out.println(ans);
//    }
//}