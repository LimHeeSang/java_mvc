package mvc2_2.controller;

import mvc2_2.view.LottoEndOutputView;

public class LottoEndController implements ControllableV2 {

    @Override
    public void process() {
        LottoEndOutputView.printExit();
    }
}
