package mvc2_2.controller;

import jsp.Lotto;
import jsp.LottoRepository;
import mvc.InputView;
import mvc2_2.view.LottoBuyOutputView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LottoBuyController implements ControllableV2 {

    private static final LottoRepository lottoRepository = LottoRepository.getInstance();

    @Override
    public void process() {
        List<Integer> numbers = InputView.inputLotto();

        Lotto lotto = new Lotto(numbers);
        Lotto saveLotto = lottoRepository.save(lotto);

        Map<String, Object> model = new HashMap<>();
        model.put("lotto", saveLotto.getLotto());
        LottoBuyOutputView.printLotto(model);
    }
}
