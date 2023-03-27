import java.util.Scanner;
public class Ex1546 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int[] arr = new int[a];
        float[] rec = new float[a];
        float sum = 0;

        for (int i = 0 ; i < arr.length ;  i++ ) {

            arr[i] = sc.nextInt();

        }

        int max = arr[0];

        for (int i = 0 ; i<arr.length ; i++ ) {

            if (max<arr[i]) {

                max = arr[i];

            }

        }

        for (int i = 0 ; i<arr.length ; i++) {

            rec[i] = ((float)arr[i] / (float)(max)) * 100;
            sum += rec[i];

        }

        float rev = sum/a;

        System.out.println(rev);

    }
}
