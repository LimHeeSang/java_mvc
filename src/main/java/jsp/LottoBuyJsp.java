package jsp;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LottoBuyJsp {

    private static final LottoRepository lottoRepository = LottoRepository.getInstance();

    public static void buyLotto() {
        Lotto lotto = new Lotto(inputLotto());
        Lotto saveLotto = lottoRepository.save(lotto);

        System.out.println("로또를 구입했습니다.");
        System.out.println(saveLotto.getLotto());
        System.out.println();
    }

    public static List<Integer> inputLotto() {
        System.out.println("구입할 로또 번호를 입력 해주세요: ");

        String number = new Scanner(System.in).nextLine();
        String[] split = number.split(",");
        return Arrays.stream(split)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}
