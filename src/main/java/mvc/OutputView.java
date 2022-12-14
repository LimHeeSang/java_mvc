package mvc;

import jsp.Lotto;

import java.util.List;

public class OutputView {

    public static void printLotto(Lotto lotto) {
        System.out.println("로또를 구입했습니다.");
        System.out.println(lotto.getLotto());
    }

    public static void printLottosCount(int size) {
        System.out.printf("구입한 로또의 개수는 %d장 입니다.", size);
        System.out.println();
    }

    public static void printLottos(List<Lotto> lottos) {
        System.out.println("구입한 로또 목록입니다.");
        for (Lotto lotto : lottos) {
            System.out.println(lotto.getLotto());
        }
    }

    public static void printExit() {
        System.out.println("프로그램을 종료합니다.");
    }
}
