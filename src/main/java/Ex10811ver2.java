import java.util.Scanner;
public class Ex10811ver2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int[] arr = new int[sc.nextInt()];

        for (int i = 0 ; i < arr.length ; i++) {

            arr[i] = i+1;

        }

        int b = sc.nextInt();

        for (int i = 0 ; i < b ; i++ ) {

            int c = sc.nextInt()-1;
            int d = sc.nextInt()-1;

            for(int j = c; j <= d; j++, d--) {

                int temp = arr[j];
                arr[j] = arr[d];
                arr[d] = temp;

            }

        }

        for (int i = 0 ; i < arr.length ; i++ ) {

            System.out.printf("%d ",arr[i]);

        }

    }
}
