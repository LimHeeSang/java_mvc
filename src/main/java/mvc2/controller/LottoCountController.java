package mvc2.controller;

import jsp.LottoRepository;
import mvc1.view.LottoCountOutputView;

public class LottoCountController implements ControllableV2 {

    private static final LottoRepository lottoRepository = LottoRepository.getInstance();

    @Override
    public void process() {
        int size = lottoRepository.size();
        LottoCountOutputView.printLottosCount(size);
    }
}
