package Bj_Set;

import java.util.HashMap;
import java.util.Scanner;

public class Ex_14425 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt(); // 포함 판단 기준이 되는 단어의 수
        int num = sc.nextInt(); // 포함되는지 판단 할 단어의 수
        int count = 0; // 포함되는 단어 수 체크

        HashMap<String, Integer> map = new HashMap<>(); // 중복값 없이 받음(판단 기준 단어)

        for(int i = 0 ; i < length; i++) { // 판단 기준 단어의 수만큼 반복
           map.put(sc.next(),0);
        }
        for(int i = 0; i < num; i++) { // 포함되는지 판단 할 수만큼 반복
            if(map.containsKey(sc.next())) // 포함되어있다면
                count++; // 카운터+1
        }
        System.out.println(count); // 포함되는 단어 수 출력
    }
}

