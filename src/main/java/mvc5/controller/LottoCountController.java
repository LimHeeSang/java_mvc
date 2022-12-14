package mvc5.controller;

import jsp.LottoRepository;
import mvc4.controller.ControllableV4;

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
