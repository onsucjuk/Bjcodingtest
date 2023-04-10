import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1152ver2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼로 입력 값 저장 선언

        StringTokenizer st = new StringTokenizer(br.readLine()," "); // 한 줄의 입력 값 버퍼에 저장, " " 기준으로 단어 나눠서 저장(StringTokenizer)

        System.out.println(st.countTokens());//StringTokenizer[약어로 st로 명명]의 단어 수  세는 명령어 = st의 변수명.countTokens <


    }
}
