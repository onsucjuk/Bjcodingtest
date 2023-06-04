package org.example;

import java.util.Scanner;

public class Ex_starsquare3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int point = a/2 + 1;
        int count = 1;

        for (int i = 1; i <= a; i++) {
            if (i <= point) {
                for(int k = point; k > 0; k--){
                    System.out.print(" ");
                }
                for(int j = 0; j < 2*i-1; j++) {
                    System.out.print("*");
                }
            }
            if (i > point) {
                for(int k = 0; k < count; k++)
                    System.out.print(" ");
                for(int j = 2*(i-count)-1; j > 0 ; j-- ){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
