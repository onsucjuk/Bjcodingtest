package org.example;

import java.util.Scanner;

public class Ex_StarSquare4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int p = row/2+1;

        for(int i = 1; i <= row; i++){
            if(i<=p){
                for(int j = p-i; j > 0; j--){
                    System.out.print(" ");
                }
                for(int k = 0; k < 2*i-1; k++){
                    System.out.print("*");
                }
            } else {
                for(int j = 0; j < i-p; j++){
                    System.out.print(" ");
                }
                for(int k = 4*p-2*i-1; k > 0; k--){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
