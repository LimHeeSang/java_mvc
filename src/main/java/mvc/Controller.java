package mvc;

import jsp.Lotto;
import jsp.LottoRepository;

import java.util.List;

public class Controller {

    private static final LottoRepository lottoRepository = LottoRepository.getInstance();
    public static final String END = "4";

    public void run() {
        String menu = "0";

        while (!menu.equals(END)) {
            menu = readMenu();

            if (menu.equals("1")) {
                buyLotto();
            }
            if (menu.equals("2")) {
                getLottosCount();
            }
            if (menu.equals("3")) {
                getLottos();
            }
            if (menu.equals(END)) {
                endPrint();
            }
            System.out.println();
        }
    }

    public String readMenu() {
        return InputView.inputMenu();
    }

    public void buyLotto() {
        List<Integer> numbers = InputView.inputLotto();

        Lotto lotto = new Lotto(numbers);
        Lotto saveLotto = lottoRepository.save(lotto);
        OutputView.printLotto(saveLotto);
    }

    public void getLottosCount() {
        int size = lottoRepository.size();
        OutputView.printLottosCount(size);
    }

    public void getLottos() {
        List<Lotto> lottos = lottoRepository.findAll();
        OutputView.printLottos(lottos);
    }

    public void endPrint() {
        OutputView.printExit();
    }
}
