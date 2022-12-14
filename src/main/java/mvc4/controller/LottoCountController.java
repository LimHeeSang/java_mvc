package mvc4.controller;

import jsp.LottoRepository;
import mvc3.controller.ControllableV3;
import mvc3.controller.ViewModel;

import java.util.Map;

public class LottoCountController implements ControllableV4 {

    private static final LottoRepository lottoRepository = LottoRepository.getInstance();

    @Override
    public String process(Map<String, Object> model) {
        int size = lottoRepository.size();
        model.put("size", size);
        return "count";
    }
}
