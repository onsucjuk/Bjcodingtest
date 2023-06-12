package Bj_Argorithm.impl;
import java.util.Scanner;

public class Ex_1213 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        String s = kbd.next();

        int[] countedArray = new int[26];
        StringBuilder sb = new StringBuilder();
        String a;
        char midChar = 0;
        boolean chkmid = false;


        for (char val : s.toCharArray()) {
            countedArray[val - 'A'] += 1;
        }

        for (int i = 0; i < 26; i++) {
            if (countedArray[i] % 2 == 1) {

                if (chkmid) {
                    System.out.println("I'm Sorry Hansoo");
                    return;
                }
                midChar = (char) (i + 'A');
                chkmid = true;
            }

            for (int j = 0; j < countedArray[i] / 2; j++) {
                sb.append((char) (i + 'A'));
            }


        }

        String rev = new StringBuilder(sb).reverse().toString();

        if (midChar != 0) sb.append(midChar);
        sb.append(rev);

        System.out.println(sb.toString());

    }
}
