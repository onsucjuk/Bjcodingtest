import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_noneduplver2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("입력값 : ");
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, ","); // ,로 문자 구분
        int l = st.countTokens();

        int[] arr = new int[l];
        for (int i = 0; i < l; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int n = l; // [중복 제거 후 배열 크기가 줄어드는거 반영 인수 지정]
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) { // 중복된 값이 있으면 끝까지 한 칸씩 땡김
                    for (int k = j; k < n - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    n--;
                    j--;
                }
            }
        }

        for (int i = 0; i < n - 1; i++) { // 선택 정렬 줄어든 배열 크기 n 반영
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.printf("저장된 값 : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.printf("\n출력 메세지 : 저장된 값은 ");
        for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
        }
        System.out.printf("입니다.");
    }
}
