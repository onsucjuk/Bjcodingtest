package Bj_intensification;
import java.util.Scanner;
public class Ex_2738 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int hap = 0;

        int[][] arr1 = new int[x][y];
        int[][] arr2 = new int[x][y];
            for (int i = 0; i < y; i++) {
                for (int j = 0; j < y; j++) {
                    arr1[i][j] = sc.nextInt();
                }
            }
        for (int i = 0; i < y; i++) {
             for (int j = 0; j < y; j++) {
                 arr2[i][j] = sc.nextInt();
             }
        }
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < y; j++) {
                hap += arr1[i][j] + arr2[i][j];
                if(j<y-1)
                    System.out.print(hap + " ");
                   else
                    System.out.println(hap);
                hap = 0; // 매 번 합을 0으로 초기화
            }
        }
    }
}

