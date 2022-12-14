package mvc5.adapter;

import mvc3.controller.ViewModel;
import mvc5.controller.ControllableV5;

public class ControllerV5Adapter implements Adapter {

    @Override
    public boolean isSupport(Object controller) {
        return (controller instanceof ControllableV5);
    }

    @Override
    public ViewModel process(Object controller) {
        ControllableV5 controllableV5 = (ControllableV5) controller;
        String viewPath = controllableV5.process();
        return new ViewModel(viewPath);
    }
}
