import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex_sortminmaxavg {
    public static void main(String[] args) {
        int hap = 0; // 평균 값 도출 모든 배열의 합 받기 위한 인수 선언
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); // 입력 값을 한 줄로 받아옴
        StringTokenizer st = new StringTokenizer(s, ", ");
        // 한 줄로 받아온 입력 값 s를 ", " 단위로 나누어 토큰 저장
        int[] arr = new int[5]; // int를 배열크기 5인 배열 선언

        for( int i = 0 ; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            // 배열 0~4까지 5개의 숫자 입력 받음
            // String 토큰 이기 때문에 스트링 인트 타입선언 Integer.parseInt(스트링)
            hap += arr[i];
        }
        for (int i = arr.length-1; i<1; i--) { // 버블정렬 : n과n+1위치 비교해서 큰쪽 뒤로 계속 넘김 (해당 라운드 최대값 마지막 위치에 고정)
            for(int j = 0; j < i; j++) {
                if(arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        int max = arr[arr.length-1], min = arr[0];
        float avg = hap / (float) arr.length; // 평균 값은 소수점 도출 필요
        System.out.print("가장 큰 값 : " + max + " / 가장 작은 값 : " + min + " / 평균 값 : "  + avg);
    }
}
