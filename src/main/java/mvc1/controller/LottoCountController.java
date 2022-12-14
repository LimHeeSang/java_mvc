package mvc1.controller;

import jsp.LottoRepository;
import mvc1.view.LottoCountOutputView;

public class LottoCountController {

    private static final LottoRepository lottoRepository = LottoRepository.getInstance();

    public void service() {
        int size = lottoRepository.size();
        LottoCountOutputView.printLottosCount(size);
    }
}
