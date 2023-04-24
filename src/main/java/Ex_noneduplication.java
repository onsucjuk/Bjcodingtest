import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_noneduplication {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("입력값 : ");
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, ",");
        int temp = 0;

        int l = st.countTokens();
        int[] arr = new int[l];
        int[] count = new int[l];
        int[] index = new int[l];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
           }

        for (int j = arr.length-1; j > 0; j-- ) {
        for (int i = 0; i < j; i++) {
            if (arr[i] > arr[i + 1]) {
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                }
            }
        }
            for(int k : arr)
            System.out.print(k+" ");
    }
}

