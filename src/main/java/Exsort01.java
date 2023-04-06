import java.util.Scanner;

public class Exsort01 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int i,j;
        int c = sc.nextInt();
        // 입력 받을 숫자의 수 맨 첫줄에 제시 숫자 길이 늘어나도 입력 수 제시해주면 계산되게 해주고 싶었음 예시의 경우 5 입력
        int [] arr = new int[c]; // 입력 받는 수를 하나씩 저장할 배열 선언 [배열 크기는 첫 줄 선언해 준 숫자의 수를 받음]
        String s = sc.next(); // 59071의 경우 경계값이 없으므로 substring 인덱스로 구분해야 됌 charAt써봤는데 스트링 변환법을 모르겠음..

        for(i = 0; i < c; i++) { // c = 5라면 5개의 숫자 > 배열 크기 5 > 0,1,2,3,4 각각 스캐너로 받아서 하나씩 저장
            arr[i] = Integer.parseInt(s.substring(i,i+1));
            // " " 구분이 없기 때문에 전부 각각 스캐너로 못 받음 한번에 받아서 substring으로 스트링 값으로 하나씩 분해
            // Integer.parseInt로 int타입은 아니지만 순수 인트 타입으로 인식하게 바꿈(스트링인트??) int와 연산 가능
        }

        for(i = 0; i < c-1; i++) { // 입력값 갯수-1만큼 작은 순서대로 정렬(43215 > 1/2/3/4/5 총 4회 필요)
            for(j = i+1; j < c; j++ ) {
                // j=i+1인 이유 i기준으로 첫번째 실행 후 해당 시행횟수에서 최솟값이 맨앞에가 있을 것이기 때문
                // 즉, 다음 시행횟수 i++가 된 후는 그 전 시행에 이미 정렬된 부분은 확인할 필요 x
                // i와 그 이후 숫자들끼리만 비교하면 되므로 i+1

                int temp = arr[i];
                // arr[i]와 arr[i+1]을 바꿀 수도 있기에 임시의 int 타입의 약자 temp 변수에 미리 저장

                if(arr[i]>arr[j]){
                    arr[i] = arr[j];
                    //arr[i]는 시행횟수마다 최소값이 와야되기 때문에 arr[i]보다 arr[j]가 작으면 arr[i]와 arr[j]의 값을 바꿈
                    arr[j] = temp;
                } // 여기까지가 a[0]일때 a[1~4]까지 모든 수와 비교하면서 작은 값이 나오면 서로 위치 교환
                //이후 i++로 초기값이 a[0>1>2>3>4]까지 변함

            }
        }
        for(int k : arr){ // k = 0에서 arr.length 까지 arr[k]를 출력한다는 의미
            System.out.print(k);
        }
        sc.close();
        //왜 닫는지는 모르겠는데 항상 닫아주라길래 받았습니다. 메모리 누수?

    }
}
