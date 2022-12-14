package mvc2.controller;

import mvc.InputView;
import jsp.Lotto;
import jsp.LottoRepository;
import mvc.OutputView;

import java.util.List;

public class LottoBuyController implements ControllableV2 {

    private static final LottoRepository lottoRepository = LottoRepository.getInstance();

    @Override
    public void process() {
        List<Integer> numbers = InputView.inputLotto();

        Lotto lotto = new Lotto(numbers);
        Lotto saveLotto = lottoRepository.save(lotto);
        OutputView.printLotto(saveLotto);
    }
}
