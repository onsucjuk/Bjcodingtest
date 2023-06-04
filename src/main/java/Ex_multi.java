public class Ex_multi {
    public static void main(String[] args){


        int i,j;

        for (i =2, j = 1; i< 10 && j< 10; j++) {

            if(j==1) {
                System.out.print(i+"단 출력합니다.\n");
            }
            System.out.print(i + " x " + j + " = " + i * j + " ");
            if(j==9) {
                System.out.println("");
                System.out.printf(i+"단 끝");
                i++;
                j = 0;
            }
        }

    }
}
