package mvc2_2.controller;

import jsp.LottoRepository;
import mvc2_2.view.LottoCountOutputView;

import java.util.HashMap;
import java.util.Map;

public class LottoCountController implements ControllableV2 {

    private static final LottoRepository lottoRepository = LottoRepository.getInstance();

    @Override
    public void process() {
        int size = lottoRepository.size();
        Map<String, Object> model = new HashMap<>();
        model.put("size", size);
        LottoCountOutputView.printLottosCount(model);
    }
}
