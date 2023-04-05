import java.util.Scanner;

public class Ex2675 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 0;
        int a = sc.nextInt(); // 첫포문 시행 횟수
        int k = 0; // 한 문장에서 문자 칸 수

        for (int i = 0; i < a; i++) {

            int b = sc.nextInt(); // 두번쨰 포문 시행 횟수
            String s = sc.next(); // 문자열 축출

            for (int j = 0; j < s.length(); j++) {

                for (k = 0; k < b; k++) {
                    System.out.print(s.charAt(j));
                }

            }
            System.out.println();
        }
        sc.close();
    }
}
