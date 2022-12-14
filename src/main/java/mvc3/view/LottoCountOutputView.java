package mvc3.view;

import java.util.Map;

public class LottoCountOutputView implements Viewable {

    @Override
    public void render(Map<String, Object> model) {
        System.out.printf("구입한 로또의 개수는 %d장 입니다.\n", model.get("size"));
    }
}
