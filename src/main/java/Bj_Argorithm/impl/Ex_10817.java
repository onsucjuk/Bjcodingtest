package Bj_Argorithm.impl;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_10817 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3]; // 정수 3개를 입력받으므려 크기3 배열 선언

        for(int i = 0; i < arr.length; i++) { // 정수 3개 입력 받아서 배열에 삽입
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        // 배열 정렬

        System.out.println(arr[1]);
        // 두번째 큰 값 출력
        // 두번째 위치 출력
    }
}
