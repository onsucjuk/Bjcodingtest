import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2743 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine().trim(); // readLine()의 문자나눔은 .trim() || next()의 문자 나눔은 .split("");
// StringTokenizer(문자열,구분자[default = 띄어쓰기],true/flase[구분된 문자열 토큰에 포함 여부 default = false])
        int a = st.length();

        System.out.println(a);

    }
}
