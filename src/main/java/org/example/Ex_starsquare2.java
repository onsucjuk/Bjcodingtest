package org.example;

import java.util.Scanner;
public class Ex_starsquare2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int point = a/2+1;
        int c = 0;
        int star = 1;
        int blank = point-1;
        for (int k = 0; k < a; k++) {
            for (int i = blank; i > c; i--) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }

            if (k < point) {
                star += 2;
                c++;
            } else {
                star -= 2;
                c--;
            }

            System.out.println();
        }
    }
}
