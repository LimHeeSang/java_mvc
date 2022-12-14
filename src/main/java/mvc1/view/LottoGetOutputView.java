package mvc1.view;

import jsp.Lotto;

import java.util.List;

public class LottoGetOutputView {

    public static void printLottos(List<Lotto> lottos) {
        System.out.println("구입한 로또 목록입니다.");
        for (Lotto lotto : lottos) {
            System.out.println(lotto.getLotto());
        }
    }
}
