import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {

            float a = (float) sc.nextInt();
            float b = (float) sc.nextInt();
            int c = (int) a;
            int d = (int) b;
            float f = c / (float)d;
            float e = c / d;

            if (a == 0)
                break;

            if (a/b > 1 && a/b == e) {
                System.out.printf("multiple\n");
            }  else if (a/b < 1 && a/b == f) {
                System.out.printf("factor\n");
            } else {
                System.out.printf("neither\n");
            }
        }
        sc.close();
        }
    }
