package Bj_intensification;

import java.util.Arrays;
import java.util.Scanner;
public class Ex_1316 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt(); // 첫 줄에 단어의 갯수 제시해 줌
        int num = line; // 그룹 단어의 수를 체크하기 위한 변수
        boolean bl[] = new boolean[26]; // 알파뱃 26개의 연속여부 판단

        for (int i = 0; i < line; i++) { // 단어의 갯수만큼 단어를 받아옴
            String s = sc.next(); // 단어를 받아옴
            Arrays.fill(bl,false); // 새로운 단어를 받아 올 때 마다 bl배열 초기화

            for (int j = 0; j < s.length() - 1; j++) { // 단어의 길이-1만큼 단어의 연속성 체크
                if (s.charAt(j) != s.charAt(j + 1)) { // 앞뒤 문자끼리 비교해서 다르면 체크
                    if (bl[s.charAt(j + 1) - 97]==false) { // 뒷문자가 기본값(false)라면 연속o
                        bl[s.charAt(j) - 97] = true; // 앞문자를 true로 변경
                    } else if(bl[s.charAt(j + 1) - 97]==true) {
                        // 뒷문자가 true라면 이미 나온 문자이므로 그룹 단어 x
                        num--; // 전체 문자 수에서 그룹 단어가 아니기 때문에 -1
                        break; // 그룹 단어가 아님이 판별 났으므로 break
                    }
                }
            }
        }
        System.out.println(num); // 그룹 단어의 갯수 출력
    }
}
