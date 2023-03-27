import java.util.Scanner;

public class Ex10811 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[a];


        for (int i = 0 ; i < a ; i++ ) {

            arr[i] = i+1;

        }

        for (int i = 0; i < b ; i++ ) {

            int c = sc.nextInt();
            int d = sc.nextInt();

            int e = arr[c-1];
            int f = arr[d-1];

            arr[c-1] = f;
            arr[d-1] = e;

            for (int j = c+1 ; j < d - 1; j++) {

                    int g = arr[j-1];
                    int h = arr[j];

                    arr[j-1] = h;
                    arr[j] = g;

                }

        }

        for (int k = 0 ; k < a ; k++ ) {

            System.out.printf(arr[k] + " ");

        }

    }

}
