package mvc2.controller;

import mvc1.view.LottoEndOutputView;

public class LottoEndController implements ControllableV2 {

    @Override
    public void process() {
        LottoEndOutputView.printExit();
    }
}
