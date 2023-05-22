package Bj_Stack;

import java.util.Scanner;
import java.util.Stack;

public class Ex_9012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        for(int i = 0; i < T; i++) {
            System.out.println(discrim(in.next()));
            // stack 연산 부분을 메서드로 선언
        }
    }

    public static String discrim(String s) {
        // 메서드 명은 판별을 의미하는 discrimination를 줄여 discrim으로 선언

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == '(') { // '('면 경우 스택에 넣는다.
                stack.push(c);
            }

            else if (stack.empty()) {
                // 이후는 ')'일 경우, 만약 스택이 비어있는데 ')'라면 숫자가 안 맞는 것이므로 바로 "NO" 리턴
                return "NO";
            }
            // 나머지는 '('와 ')'가 짝을 이루는 것이기 때문에 '('를 뺴준다(pop)
            else {
                stack.pop();
            }
        }

        if (stack.empty()) {
            return "YES"; // 비어있으면 짝이 맞는 것이므로 "YES" 리턴
        }
        else {
            return "NO"; // 모든 작업 수행 후 남아있다면 '('가 더 많다는 의미 이므로 "NO" 리턴
        }
    }
}
