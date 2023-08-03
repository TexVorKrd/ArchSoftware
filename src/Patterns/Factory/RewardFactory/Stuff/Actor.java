package Patterns.Factory.RewardFactory.Stuff;

import Patterns.Factory.RewardFactory.Classes.IGameItem;

import java.util.LinkedList;
import java.util.List;

/**
 * Персонаж с именем name, владелец счета с валютами Gold в goldValue и Gem в gemValue
 * и множества неоткрытых объектов(сундуков) типа IGameItem
 */

public class Actor {
    private String name;
    private int goldValue = 0;
    private int gemValue = 0;
    private List<IGameItem> treasures = new LinkedList<>();

    public Actor(String name) {
        this.name = name;
    }

    /**
     * Пополняет валюту Gold
     *
     * @param gold - валюта с количеством.
     */
    public void addCurency(Gold gold) {
        this.goldValue += gold.get();
    }

    /**
     * Пополняет валюту Gem
     *
     * @param gems - валюта с количеством.
     */
    public void addCurency(Gem gems) {
        this.gemValue += gems.get();
    }

    /**
     * Возвращает информацию о наличии валюты у игрока
     */
    public void accountInfo() {
        String msg = new StringBuilder()
                .append("Персонаж - " + name)
                .append(" Gold - " + goldValue)
                .append(" Gems - " + gemValue)
                .toString();
        System.out.println(msg);
    }

    /**
     * @param treasere получение объекта(сундука) типа IGameItem который может быть потом открыт
     *                 а его содержимое добавлено на счет игрока.
     */
    public void addTreasures(IGameItem treasere) {
        if (treasere != null) this.treasures.add(treasere);
    }

    /**
     * Открыват все сундуки у игрока, содержимое добавляет на счет
     * и очищает список сундукков
     */
    public void openAll() {

        for (IGameItem chest : treasures) {

            GetebleCurensy inValue = chest.open();

            if (inValue instanceof Gold) addCurency((Gold) inValue);
            if (inValue instanceof Gem) addCurency((Gem) inValue);

        }
        treasures.clear();
    }
}
