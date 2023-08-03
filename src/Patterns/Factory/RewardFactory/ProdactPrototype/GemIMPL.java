package Patterns.Factory.RewardFactory.ProdactPrototype;

import Patterns.Factory.RewardFactory.Classes.IGameItem;
import Patterns.Factory.RewardFactory.Stuff.Gem;
import Patterns.Factory.RewardFactory.Stuff.GetebleCurensy;
import Patterns.Factory.RewardFactory.Stuff.Gold;

/**
 * Источник Валюты (Gem)
 * Количество валюты фиксируется в момент создания объекта и после открытие содержимое передается и уничтожается.
 */
public class GemIMPL implements IGameItem {

    private Gem gem;

    public GemIMPL(int value) {
        this.gem = new Gem(value);
    }

    /**
     * Передает содержимое, и уничтожает его внутри объекта.
     * Выдает информационное соощение.
     *
     * @return - Объект GetebleCurensy
     */
    @Override
    public GetebleCurensy open() {
        if (gem == null) return new Gold(0);
        Gem gemReturn = new Gem(gem.get());
        System.out.println("Открыт сундук с кристалами, получено " + gem.get());
        gem = null;
        return gemReturn;
    }
}
