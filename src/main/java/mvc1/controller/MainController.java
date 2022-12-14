package mvc1.controller;

import mvc.InputView;

public class MainController {

    public static final String END = "4";

    private final LottoBuyController lottoBuyController;
    private final LottoCountController lottoCountController;
    private final LottoGetController lottoGetController;
    private final LottoEndController lottoEndController;

    public MainController() {
        lottoBuyController = new LottoBuyController();
        lottoCountController = new LottoCountController();
        lottoGetController = new LottoGetController();
        lottoEndController = new LottoEndController();
    }

    public void run() {
        String menu = "0";

        while (!menu.equals(END)) {
            menu = InputView.inputMenu();

            if (menu.equals("1")) {
                lottoBuyController.service();
            }
            if (menu.equals("2")) {
                lottoCountController.service();
            }
            if (menu.equals("3")) {
                lottoGetController.service();
            }
            if (menu.equals(END)) {
                lottoEndController.service();
            }
            System.out.println();
        }
    }
}
