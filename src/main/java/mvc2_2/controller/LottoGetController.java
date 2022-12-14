package mvc2_2.controller;

import jsp.Lotto;
import jsp.LottoRepository;
import mvc2_2.view.LottoGetOutputView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LottoGetController implements ControllableV2 {

    private static final LottoRepository lottoRepository = LottoRepository.getInstance();

    @Override
    public void process() {
        List<Lotto> lottos = lottoRepository.findAll();
        Map<String, Object> model = new HashMap<>();
        model.put("lottos", mapToInteger(lottos));
        LottoGetOutputView.printLottos(model);
    }

    private List<List<Integer>> mapToInteger(List<Lotto> lottos) {
        return lottos.stream()
                .map(Lotto::getLotto)
                .collect(Collectors.toList());
    }
}
