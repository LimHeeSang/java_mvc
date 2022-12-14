package mvc5.controller;

import jsp.Lotto;
import jsp.LottoRepository;
import mvc.InputView;
import mvc3.controller.ControllableV3;
import mvc3.controller.ViewModel;

import java.util.List;

public class LottoBuyController implements ControllableV3 {

    private static final LottoRepository lottoRepository = LottoRepository.getInstance();

    @Override
    public ViewModel process() {
        List<Integer> numbers = InputView.inputLotto();

        Lotto lotto = new Lotto(numbers);
        Lotto saveLotto = lottoRepository.save(lotto);

        ViewModel viewModel = new ViewModel("buy");
        viewModel.add("lotto", saveLotto.getLotto());
        return viewModel;
    }
}
