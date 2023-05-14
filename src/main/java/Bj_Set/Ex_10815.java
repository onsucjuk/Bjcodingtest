package Bj_Set;

import java.util.HashSet;
import java.util.Scanner;

public class Ex_10815 {
    public static void main(String[] args){

        HashSet<Integer> set = new HashSet<>(); // 중복 제거 데이터 받아옴(숫자이므로 Integer타입)
        Scanner sc = new Scanner(System.in); // 데이터 입력 받음(Scanner활용)
        int num = sc.nextInt(); // 각 입력 받을 데이터 갯수를 먼저 알려줌(Scanner로받음)

        for(int i = 0; i < num; i++){ // 입력 받을 데이터의 수 만큼 for문을 통해 hash set에 저장
            set.add(sc.nextInt());
        }

        int num2 = sc.nextInt(); // 확인 갯수 입력 받음

        for(int i = 0; i < num2; i++ ) { // 확인할 갯수만큼 포함하고있는지(.contains를 통해) 반환
            if(set.contains(sc.nextInt())){
                System.out.print(1+" "); // true면 1 출력
            } else {
                System.out.print(0+" "); // false면 0 출력
            }
        }
        sc.close(); // Scanner sc 닫음
    }
}
