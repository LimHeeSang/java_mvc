package mvc1;

import mvc1.controller.MainController;

public class App {

    public static void main(String[] args) {
        MainController mainController = new MainController();
        mainController.run();
    }
}
