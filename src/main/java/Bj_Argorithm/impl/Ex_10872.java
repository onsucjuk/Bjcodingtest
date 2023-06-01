package Bj_Argorithm.impl;

import java.util.Scanner;

public class Ex_10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fnum = num;

        while(true){
            if(num == 0) {
                System.out.println(1);
                break;
            } else if(num > 1) {
                fnum = fnum * --num;
                if(num==1){
                    System.out.println(fnum);
                    break;
                }
            }
        }
        sc.close();
    }
}
