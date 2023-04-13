import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Ex2908 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        String[] str = new String[4];

        int[] arr = new int[2];

        for(int i = 0 ; i < 2; i++) {
                    String s1 = st.nextToken();
            for(int j = 0; j < 3; j++) {
                   str[j] = String.valueOf(s1.charAt(j));
                }
               arr[i] = Integer.parseInt(str[2]+str[1]+str[0]);
            }

        if (arr[0] > arr[1]) {
                System.out.print(arr[0]);
        } else {
                System.out.print(arr[1]);
        }
    }
}

