package Patterns.Factory.RewardFactory.ProdactPrototype;

import Patterns.Factory.RewardFactory.Classes.IGameItem;
import Patterns.Factory.RewardFactory.Stuff.GetebleCurensy;
import Patterns.Factory.RewardFactory.Stuff.Gold;


/**
 * Источник Валюты (Gold)
 * Количество валюты фиксируется в момент создания объекта и после открытие содержимое передается и уничтожается.
 */
public class GoldIMPL implements IGameItem {

    private Gold gold;

    public GoldIMPL(int value) {
        this.gold = new Gold(value);

    }

    /**
     * Передает содержимое, и уничтожает его внутри объекта.
     * Выдает информационное соощение.
     *
     * @return - Объект GetebleCurensy
     */
    @Override
    public GetebleCurensy open() {
        if (gold == null) return new Gold(0);
        Gold goldReturn = new Gold(gold.get());
        System.out.println("Открыт сундук с Золотом, получено " + gold.get());
        gold = null;
        return goldReturn;
    }
}
