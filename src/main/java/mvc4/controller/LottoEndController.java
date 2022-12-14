package mvc4.controller;

import java.util.Map;

public class LottoEndController implements ControllableV4 {

    @Override
    public String process(Map<String, Object> model) {
        return "end";
    }
}
