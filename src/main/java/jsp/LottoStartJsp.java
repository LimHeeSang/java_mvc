package jsp;

import java.util.Scanner;

public class LottoStartJsp {

    public static String inputMenu() {
        System.out.println("-----------------");
        System.out.println("1. 로또 구입");
        System.out.println("2. 구입한 로또 개수 조회");
        System.out.println("3. 구입한 로또 조회");
        System.out.println("4. 종료");
        System.out.println("번호를 입력해 주세요: ");
        return new Scanner(System.in).nextLine();
    }
}
