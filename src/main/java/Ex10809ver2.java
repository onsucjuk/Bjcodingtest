import java.util.Scanner;
public class Ex10809ver2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i;
        int[] arr = new int[26]; // 알파뱃 a~z 26개 배열 생성
        String s = sc.nextLine();

        for(i = 0; i < arr.length; i++) { // 배열-1로 초기화
                    arr[i] = -1;
                    }

        for (i = 0; i < s.length(); i++) { // 입력받아온 s의 길이만큼 문자 분해 출력

            char ch = s.charAt(i);

            if ( arr[ch-97] == -1) {
                // 0부터 'a'입력되어있기 때문에 ch의 위치는 'a'의 아스키 코드값 97을 뺀 인덱스에 위치해있다.
                // ex a-97('a') = 0, b-97('a') = 1 ...
                // 첫번째 입력 값 출력이기 때문에 초기값 -1일때만 위치 i를 출력하도록 바꿔야한다.
                arr[ch-97] = i;
            }
        }
        for (int k :arr) { // k=0~arr.length까지 arr[k] 값 출력
            System.out.printf("%d ", k);
        }
    }
}
