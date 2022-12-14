package mvc1.controller;

import jsp.Lotto;
import jsp.LottoRepository;
import mvc1.view.LottoGetOutputView;

import java.util.List;

public class LottoGetController {

    private static final LottoRepository lottoRepository = LottoRepository.getInstance();

    public void service() {
        List<Lotto> lottos = lottoRepository.findAll();
        LottoGetOutputView.printLottos(lottos);
    }
}
