package mvc4.controller;

import mvc.InputView;
import jsp.Lotto;
import jsp.LottoRepository;

import java.util.List;
import java.util.Map;

public class LottoBuyController implements ControllableV4 {

    private static final LottoRepository lottoRepository = LottoRepository.getInstance();

    @Override
    public String process(Map<String, Object> model) {
        List<Integer> numbers = InputView.inputLotto();

        Lotto lotto = new Lotto(numbers);
        Lotto saveLotto = lottoRepository.save(lotto);
        model.put("lotto", saveLotto.getLotto());
        return "buy";
    }
}
