package Bj_intensification;

import java.util.Scanner;

public class Ex_25206 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double hap = 0; // 전공 과목별 점수(학점 * 과목 평점)의 총합
        double count = 0; // 과목 학점의 총합
        // 전공 평점(정공 과목별 총합 / 과목 학점 총합)

        for(int i = 0; i < 20; i++) { // 수강 과목은 20개라고 주어짐
            String s = sc.nextLine();
            String str[] = s.split(" ");
            // 각 과목은 " " 기준으로 [0] = 과목, [1] = 학점, [2] = 평점

            Double score = Double.parseDouble(str[1]); // 과목의 학점
            String grd = str[2]; // 과목의 평점

/*            System.out.println(i+"회차 학점은 "+scr+"입니다."); */

            switch(grd){ // 평점은 A+~F로 주어지고 각 평점에 따라 점수와 학점의 합을 구함
                case "A+" : hap += score*4.5; count += score; break;
                case "A0" : hap += score*4.0; count += score; break;
                case "B+" : hap += score*3.5; count += score; break;
                case "B0" : hap += score*3.0; count += score; break;
                case "C+" : hap += score*2.5; count += score; break;
                case "C0"  : hap += score*2.0; count += score; break;
                case "D+" : hap += score*1.5; count += score; break;
                case "D0" : hap += score*1.0; count += score; break;
                case " F" : ; count += score; break;
                case " P" : count--; break;
            }

/*            System.out.println(i+"회차에서의 학점의 합계는" + hap + "입니다.");*/

        }
        double avg = hap / count; //평균 도출

        if(count!=0) {
            System.out.printf("%.6f",avg);
        } else {
            System.out.printf("%.6f",0.0); // 올P로 count가 0일때 0.000000출력 대비
        }
    }
}
