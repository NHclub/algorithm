package _09_14;
import com.sun.tools.javac.Main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Boj10828 {

    List<Integer> stack = new ArrayList<>();

    public void push(int x) {
        stack.add(x);
    }

    public int pop() {
        if (stack.isEmpty()) {
            return -1;
        } else {
            return stack.remove(stack.size() - 1);
        }
    }

    public int size() {
        return stack.size();
    }

    public int empty() {
        if (stack.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }

    public int top() {
        if (stack.isEmpty()) {
            return -1;
        } else {
            return stack.get(stack.size() - 1);
        }
    }

    public static void main(String[] args) throws IOException {
        Boj10828 stackProgram = new Boj10828();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] command = br.readLine().split(" ");

            switch (command[0]) {
                case "push":
                    int value = Integer.parseInt(command[1]);
                    stackProgram.push(value);
                    break;
                case "pop":
                    sb.append(stackProgram.pop()).append("\n");
                    break;
                case "size":
                    sb.append(stackProgram.size()).append("\n");
                    break;
                case "empty":
                    sb.append(stackProgram.empty()).append("\n");
                    break;
                case "top":
                    sb.append(stackProgram.top()).append("\n");
                    break;
            }
        }
        System.out.println(sb.toString());
    }
}
