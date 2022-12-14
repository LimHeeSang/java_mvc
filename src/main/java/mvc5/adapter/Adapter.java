package mvc5.adapter;

import mvc3.controller.ViewModel;

public interface Adapter {

    boolean isSupport(Object controller);

    ViewModel process(Object controller);
}
