package mvc3.controller;

import jsp.LottoRepository;

public class LottoCountController implements ControllableV3 {

    private static final LottoRepository lottoRepository = LottoRepository.getInstance();

    @Override
    public ViewModel process() {
        int size = lottoRepository.size();
        ViewModel viewModel = new ViewModel("count");
        viewModel.add("size", size);
        return viewModel;
    }
}
