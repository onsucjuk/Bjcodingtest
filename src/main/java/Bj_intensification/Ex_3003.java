package Bj_intensification;

import java.io.*;
import java.util.StringTokenizer;

public class Ex_3003 {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[6]; // 킹, 퀸, 룩, 나이트, 비숍, 폰의 갯수 넣어 둘 배열

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            br.close();
            StringTokenizer st = new StringTokenizer(s, " ");

        for (int i = 0; i < arr.length; i++) {
                if(i<2) { // (킹,퀸), (나이트 비숍, 룩), (폰)으로 갯수 별로 나눠서 배열 저장하면서 인수 받아서 갯수 갱신
                        arr[i] = 1 - Integer.parseInt(st.nextToken());
                        System.out.print(arr[i]+" "); // 구분 " "포함 출력
                    } else if(i<5) {
                            arr[i] = 2 - Integer.parseInt(st.nextToken());
                            System.out.print(arr[i]+" ");
                        } else {
                                arr[i] = 8 - Integer.parseInt(st.nextToken());
                                System.out.print(arr[i]); // 마지막 출력(폰 갯수)시 갯수만 출력
                            }
        }
    }
}
