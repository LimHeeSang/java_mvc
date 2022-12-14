package jsp;

public class App {

    public static void main(String[] args) {
        while (true) {
            String menu = LottoStartJsp.inputMenu();

            if (menu.equals("1")) {
                LottoBuyJsp.buyLotto();
            }
            if (menu.equals("2")) {
                LottoCountJsp.getLottosCount();
            }
            if (menu.equals("3")) {
                LottoGetJsp.getLottos();
            }
            if (menu.equals("4")) {
                LottoEndJsp.printEnd();
                break;
            }
        }
    }
}
