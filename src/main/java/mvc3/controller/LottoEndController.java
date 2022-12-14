package mvc3.controller;

public class LottoEndController implements ControllableV3 {

    @Override
    public ViewModel process() {
        return new ViewModel("end");
    }
}
