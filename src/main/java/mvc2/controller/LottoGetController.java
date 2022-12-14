package mvc2.controller;

import jsp.Lotto;
import jsp.LottoRepository;
import mvc1.view.LottoGetOutputView;

import java.util.List;

public class LottoGetController implements ControllableV2 {

    private static final LottoRepository lottoRepository = LottoRepository.getInstance();

    @Override
    public void process() {
        List<Lotto> lottos = lottoRepository.findAll();
        LottoGetOutputView.printLottos(lottos);
    }
}
