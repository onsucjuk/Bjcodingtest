package Bj_intensification;

import java.util.Scanner;

public class Ex_4344 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt(); // 첫줄에 제시된 숫자는 평균을 구하는 횟수(줄의 수)
        int hap = 0; // 합의 값을 저장하는 변수
        float count = 0; // 평균 이상의 학생 수를 카운트 하기 위한 변수

        for(int i = 0; i < line; i++) { // 각 줄마다 평균을 구하고 평균보다 큰 학생 수의 비율을 구할 것

            int num = sc.nextInt(); // 한 줄의 학생 수(= 한 라인의 첫번째 숫자)
            int list[] = new int[num];
            // 매 줄마다 배열을 저장 하기 때문에 for 내부에 생성(배열 길이가 달라짐)
            // 만약 첫번째에 배렬 크기가 주어지지 않는다면
            // sc.nextLine()으로 받고
            // int list[] = sc.nextLine().split(" "); 공백 기준으로 나눠서 배열에 저장했을 것
            // 배열의 크기는 list.length

            for(int j = 0; j < num; j++ ) { // 배열의 크기 만큼 저장하면서 총합을 구하기 위해 더함
                    list[j] = sc.nextInt();
                    hap += list[j];
                }
            float avg = hap/(float)num; // 평균 = 총합(hap) / 갯수(배열크기 num)
            hap = 0; // avg를 산출을 완료했고 다음 줄에서 hap을 다시 해야되기 때문에 초기화

            for(int j = 0; j < num; j++ ) { // 평균보다 큰 학생 수(count로 받음)
                if(avg < (float) list[j]){ // 각 배열의 값이 평균보다 큰지 비교하고 크다면 count++
                    count++;
                }
            }
            avg = count/(float)num*100; // 답에서 백분율로 표시 원하기 때문에 * 100
            count = 0; // count 변수 초기화

            System.out.printf("%7.3f%%\n",avg); // 표기를 소수점 3짜리에사 반올림 원함.
        }
        sc.close(); // sc닫음
    }
}
