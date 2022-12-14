package mvc3.controller;

import jsp.Lotto;
import jsp.LottoRepository;

import java.util.List;
import java.util.stream.Collectors;

public class LottoGetController implements ControllableV3 {

    private static final LottoRepository lottoRepository = LottoRepository.getInstance();

    @Override
    public ViewModel process() {
        List<Lotto> lottos = lottoRepository.findAll();
        ViewModel viewModel = new ViewModel("get");
        viewModel.add("lottos", mapToInteger(lottos));
        return viewModel;
    }

    private List<List<Integer>> mapToInteger(List<Lotto> lottos) {
        return lottos.stream()
                .map(Lotto::getLotto)
                .collect(Collectors.toList());
    }
}
