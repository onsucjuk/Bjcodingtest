package Bj_intensification;

import java.util.Scanner;
public class Ex_2444 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int point = sc.nextInt();

        for (int i = 1; i < 2 * point; i++ ) {
            if(i < point+1) {
                for (int j = point; j > i; j--) {
                    System.out.print(" ");
                }
                for (int k = 0; k < (2*i)-1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            if(i >= point + 1){
                for (int j = 0; j < i-point; j++) {
                    System.out.print(" ");
                }
                for (int k = 2*(2*point-i)-1 ; k > 0; k--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
