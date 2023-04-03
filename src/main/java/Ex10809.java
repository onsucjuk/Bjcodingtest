import java.util.Scanner;

public class Ex10809 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String c = sc.next();
        int num = c.length();
        int count = 0;

        for (int i = 97; i <= 122; i++) {

            for(int j = 0; j < num; j++) {

                int b = c.charAt(j);

                if(i == b) {

                    count++;
                    System.out.printf("%d ",j);

                } else if(j == num-1 && count == 0) {

                    System.out.printf("%d ", -1);

                }

            }

            count = 0;

        }

    }
}
