package jsp;

import java.util.List;

public class LottoGetJsp {

    private static final LottoRepository lottoRepository = LottoRepository.getInstance();

    public static void getLottos() {
        System.out.println("구입한 로또 목록입니다.");
        List<Lotto> lottos = lottoRepository.findAll();
        for (Lotto lotto : lottos) {
            System.out.println(lotto.getLotto());
        }
        System.out.println();
    }
}
