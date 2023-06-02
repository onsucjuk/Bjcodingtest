package Bj_Argorithm.impl;

import java.util.Scanner;

public class Ex_2558 {
    public static void main(String[] args) {
        int num1, num2;

        Scanner sc = new Scanner(System.in);

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        sum(num1,num2);

    }
    public static void sum(int val1,int val2){
        System.out.println(val1 + val2);
    }
}
