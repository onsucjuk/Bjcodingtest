import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ex_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int ini = 65; // 초기 기준값
        int time = 2;
        int sum = 0;
        int[] ntime = new int[s.length()]; // 각 단어 마다 걸린 시간 배열에 저장

        for (int i = 0; i < s.length(); i++) {
            int count = s.charAt(i); // count = 65 ~ 90 3단위 65~67. 마지막 87~89
            if (count >=80 && count <= 83){ // 중간에 문자 4문자(PQRS)
                ntime[i] = 8;
            }
            if (count >= 84 && count <= 86 ){
                ntime[i] = 9;
            }
            if (count >= 87) { // 마지막은 4문자라서 마지막 4문자만 처리 87~90(WXYZ)
                ntime[i] = 10; // 총 걸린 시간은 10초
            }
            for (int j = 3; j <= 15; ) { // j문자를 3개씩마다 도출 [P 80전까지]
                int countj = ini + j;
                if (count < countj) {
                    ntime[i] = time + (j / 3); // 3문자마다 1초씩 증가하니까 3증가치를 3으로 나눈 값을 반환하여 시간에 더함
                    ini = 65; // 기준값 더해진 것 저장되니까 초기화 시킴
                    break;
                    }
                j += 3;
                }
            }
        for (int i = 0; i < s.length(); i++) {
            sum += ntime[i];
        }
        System.out.println(sum);
    }
}