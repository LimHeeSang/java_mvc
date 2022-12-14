package jsp;

public class LottoCountJsp {

    private static final LottoRepository lottoRepository = LottoRepository.getInstance();

    public static void getLottosCount() {
        int size = lottoRepository.size();
        System.out.printf("구입한 로또의 개수는 %d장 입니다.\n", size);
    }
}
