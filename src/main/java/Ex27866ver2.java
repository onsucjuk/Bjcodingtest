import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex27866ver2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String st = br.readLine().trim();
        int num = Integer.parseInt(br.readLine());

        System.out.println(st.substring(num-1, num));
        // st.chatAt(num-1); import java.util.*; 추가 후 대체 사용 가능



    }
}
