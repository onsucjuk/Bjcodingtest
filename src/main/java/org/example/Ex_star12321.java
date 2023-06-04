package org.example;

import java.util.Scanner;
public class Ex_star12321 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("줄 수를 입력해주세요 : ");
        int a = sc.nextInt();
        int point = a / 2 + 1;
        for (int i = 1; i <= 5; i++) {
            if (i <= point) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
            } else {
            for(int k = 2*point-i; k > 0; k-- ){
                    System.out.print("*");
            }
            }
            System.out.println();
        }
    }
}
