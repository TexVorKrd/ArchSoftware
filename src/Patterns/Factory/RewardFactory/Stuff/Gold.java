package Patterns.Factory.RewardFactory.Stuff;

/**
 * Валюта (Gold)
 */
public class Gold implements GetebleCurensy {
    int value;

    public Gold(int value) {
        this.value = value;
    }

    /**
     *
     * @return - возврат количества валюты.
     */
    @Override
    public int get() {
        return value;
    }
}
