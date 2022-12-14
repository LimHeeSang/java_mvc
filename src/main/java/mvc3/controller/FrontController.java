package mvc3.controller;

import mvc.InputView;

import java.util.HashMap;
import java.util.Map;

public class FrontController {

    public static final String END = "4";
    private final Map<String, ControllableV3> controllers = new HashMap<>();

    public FrontController() {
        controllers.put("1", new LottoBuyController());
        controllers.put("2", new LottoCountController());
        controllers.put("3", new LottoGetController());
        controllers.put("4", new LottoEndController());
    }

    public static void run() {
        FrontController frontController = new FrontController();

        String menu = "0";
        while (!menu.equals(END)) {
            menu = InputView.inputMenu();
            frontController.service(menu);
            System.out.println();
        }
    }

    public void service(String path) {
        ControllableV3 controllableV3 = controllers.get(path);
        ViewModel viewModel = controllableV3.process();
        viewModel.render();
    }
}
