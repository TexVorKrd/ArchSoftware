package Patterns.Factory.RewardFactory.Factores;

import Patterns.Factory.RewardFactory.Classes.IGameItem;
import Patterns.Factory.RewardFactory.Classes.ItemGenerator;
import Patterns.Factory.RewardFactory.ProdactPrototype.GemIMPL;

/**
 * Создание обекта (сундука) стандарктного размера (Gem), количественное значение
 * регулируется константой MAX
 */
public class GemFactory extends ItemGenerator {

    private final int MAX = 100;


    @Override
    public IGameItem createItem() {
        return new GemIMPL((int)(Math.random()*MAX));
    }
}
