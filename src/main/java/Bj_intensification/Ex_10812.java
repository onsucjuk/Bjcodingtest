package Bj_intensification;

import java.util.Scanner;

public class Ex_10812 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt(); // 첫줄 첫번째 숫자는 배열 크기
        int num = sc.nextInt(); // 첫줄 두번째 숫자는 교환 위치를 제시해주는 줄의 수

        int arr[] = new int[l];
        int narr[] = new int[l];
        // 문제가 시작값 중간값 마지막 값 받아서 주어진 중간값에서 마지막값까지 시작값 위치부터 저장하고
        // 그 이후로 시작값부터 중간값까지 배열하는 식으로 위치를 바꾸는거였는데 도저히 생각이 안나서 배열 2개 준비
        // 원래 배열arr을 그대로 복제해둔 tarr에 제시하는 방식대로 넣어 배열 후 tarr의 형태로 arr배치를 하는 식으로 해결 할 생각

        for(int i = 1; i <= 10; i++){ // 먼저 arr과 tarr을 같은 배열로 초기화(1~10까지 1~10 대입)
            arr[i-1] = i;
            narr[i-1] = i;
        }

        for(int i = 0; i < num; i++){ // 스캐너로 제시해준 줄 수(num번째 줄까지)에서 제시하는 시작값, 마지막값, 중간값 받아옴
                int begin = sc.nextInt();
                int end = sc.nextInt();
                int mid = sc.nextInt();
                int begin2 =  begin;
                // 중간값 이후로 넣어줄 시작값

                for(int k = 0; k < end -begin + 1; k++) { // 전체 시행횟수
                    if (mid + k <= end) {
                        narr[begin + k-1] = arr[mid + k-1];
                    } else {
                        narr[begin + k-1] = arr[begin2-1];
                        begin2++;
                    }
                }

                for(int j = 0; j < l; j++){ // 조건에 맞게 배치 된 narr을 arr에 재배치
                    arr[j] = narr[j];
                }
        }
        for(int p = 0; p < l; p++){
            System.out.print(arr[p] + " ");
        }
    }
}
