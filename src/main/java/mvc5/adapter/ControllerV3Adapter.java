package mvc5.adapter;

import mvc3.controller.ControllableV3;
import mvc3.controller.ViewModel;

public class ControllerV3Adapter implements Adapter {

    @Override
    public boolean isSupport(Object controller) {
        return (controller instanceof ControllableV3);
    }

    @Override
    public ViewModel process(Object controller) {
        ControllableV3 controllableV3 = (ControllableV3) controller;
        ViewModel viewModel = controllableV3.process();
        return viewModel;
    }
}
