package mvc4.controller;

import jsp.Lotto;
import jsp.LottoRepository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LottoGetController implements ControllableV4 {

    private static final LottoRepository lottoRepository = LottoRepository.getInstance();

    @Override
    public String process(Map<String, Object> model) {
        List<Lotto> lottos = lottoRepository.findAll();
        model.put("lottos", mapToInteger(lottos));
        return "get";
    }

    private List<List<Integer>> mapToInteger(List<Lotto> lottos) {
        return lottos.stream()
                .map(Lotto::getLotto)
                .collect(Collectors.toList());
    }
}
