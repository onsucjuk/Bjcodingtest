import java.util.*;
public class Ex_star_cross {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("줄 수를 입력해주세요 : "); // 줄 수 입력 받는다는 메세지 출력


        int l = sc.nextInt(); // 시스템 창에 숫자 입력값을 받아옴. 전체 줄(line)수를 받는 인수이므로 약자 l로 지정

        int bm = (l / 2); // 중앙값[기준값인 bench mark 약자로 씀]을 기준으로 대칭
        int s = 0; // ~~라인에서의 star찍기 때문에 s약자로 씀
        int count = 1; // 기준점 전후로 star 찍는 기준 포인트

        for (int i = 0; i < l && s <= l; i++) {

            if (s < bm) { // 5줄 기준 0~기준점(bm = 2)라인 전까진 0>1>2, 4>3>2 로 0에서 s++되는 식으로 진행 or l - s

                if (i == s) { //s는 한 라인이 끝날 떄마다 ++해주기 때문에 bm전까진 star기준점 역할 가능

                    System.out.print("*");

                } else if (i == l - s - 1) { // 한 라인의 마지막 별점 도출 cf. l(5)-1 l=12345, i=01234이기 때문에 -1 필요

                    System.out.print("*");
                    s++;
                    i = -1;
                    System.out.println(); // 해당 라인에 마지막 별을 찍고나면 초기화 필요.

                } else {

                    System.out.print(" ");

                }

            } else if (s == bm) { // 기준점(bm)에서는 기준점에만 찍으면 됌

                if (i == bm) {

                    System.out.print("*");
                    System.out.println();
                    s++;
                    i = -1;

                } else if (i < bm) {

                    System.out.print(" ");

                }

            } else {

                if (i == bm - count) { // 기준점 이후로는 기준점 기준 --, ++부분에 *이 찍힘 >> 이후로는 s대신 count를 활용.

                    System.out.print("*");

                } else if (i == bm + count) { // bm기준 ++되는 쪽이 마지막 별이므로 이쪽에서 초기화

                    System.out.print("*");
                    s++;
                    count++;
                    i = -1;
                    System.out.println();

                } else {

                    System.out.print(" ");

                }

            }
        }
    }
}
