package mvc1.controller;

import jsp.Lotto;
import jsp.LottoRepository;
import mvc.InputView;
import mvc1.view.LottoBuyOutputView;

import java.util.List;

public class LottoBuyController {

    private static final LottoRepository lottoRepository = LottoRepository.getInstance();

    public void service() {
        List<Integer> numbers = InputView.inputLotto();

        Lotto lotto = new Lotto(numbers);
        Lotto saveLotto = lottoRepository.save(lotto);
        LottoBuyOutputView.printLotto(saveLotto);
    }
}
