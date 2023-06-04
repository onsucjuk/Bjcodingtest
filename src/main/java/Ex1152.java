import java.util.Scanner;
import java.util.StringTokenizer;
public class Ex1152 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine(); // 라인 값 전부 받아옴
        sc.close();

        StringTokenizer st = new StringTokenizer(s, " "); // " " 기준으로 s를 분해하여 st에 저장

        System.out.println(st.countTokens());

    }
}
