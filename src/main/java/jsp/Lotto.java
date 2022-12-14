package jsp;

import java.util.Collections;
import java.util.List;

public class Lotto {

    private Long id;
    private final List<Integer> lotto;

    public Lotto(List<Integer> lotto) {
        this.lotto = lotto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Integer> getLotto() {
        return Collections.unmodifiableList(lotto);
    }
}
