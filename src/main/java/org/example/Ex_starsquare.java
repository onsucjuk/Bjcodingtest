package org.example;

import java.util.Scanner;
public class Ex_starsquare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int point = a/2+1;

        for(int i = 1; i <= a; i++){
            if(i <= point) {
                for(int j = point-i; j > 0; j--){
                    System.out.print(" ");
                }
                for(int k = 0; k < 2*i-1; k++) {
                    System.out.print("*");
                }
            } else {
                for(int j = 0; j < i-point; j++ ){
                    System.out.print(" ");
                }
                for(int k = 4*point-2*i-1; k > 0; k--){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
