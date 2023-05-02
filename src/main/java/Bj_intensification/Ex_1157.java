package Bj_intensification;

import java.util.Scanner;

public class Ex_1157 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase(); // 모두 소문자로 설정
        int count3 = 0; // 중복 숫자 여부
        int[] counter2 = new int[26];
        int count = 0; // 알파뱃 사용 횟수
        for (int i = 0; i < 26; i++) {
            for (int k = 0 ; k < s.length(); k++){
                if(s.charAt(k) == (i + 97)){
                    count++;
                }
            }
            counter2[i] = count; // count값을 count 배열에 저장
            count = 0; // count 초기화
        }

        int fre = counter2[0]; // 사용 횟수 가장 많은 알파뱃
        int most = 0; // 가장 많이 사용된 알파뱃

        for(int i = 0; i < 26; i++){
            if(fre < counter2[i]){
                fre = counter2[i];
                most = i;
            }
        }

        for(int i = 0; i < 26; i++){
            if(i != most){
                if(counter2[most] == counter2[i]){
                    System.out.println("?"); // 중복이면 ? 출력
                    count3++;
                }
            }
        }
        if(count3==0)
        System.out.println((char)(most+65)); // int 타입을 char 타입으로 변환 and 반복횟수가 중복이 없으면 출력
    }
}
