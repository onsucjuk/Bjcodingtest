package Bj_math;

import java.util.Scanner;

public class Ex5086 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {

            int num1 = sc.nextInt();
            float num1f = (float)num1;
            int num2 = sc.nextInt();
            float num2f = (float)num2;

            if(num1==0)
                break;

            float resf = (float) (num2 / num1);
            float res2f = (float) (num1 / num2);

            if (resf == num2f / num1f){
                System.out.println("factor");
            } else if (res2f == num1f / num2f) {
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }

        }
        sc.close();
    }
}
