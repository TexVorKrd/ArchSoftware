package Patterns.Factory.RewardFactory.Factores;

import Patterns.Factory.RewardFactory.Classes.IGameItem;
import Patterns.Factory.RewardFactory.Classes.ItemGenerator;
import Patterns.Factory.RewardFactory.ProdactPrototype.GemIMPL;

/**
 * Создание обекта (сундука) большого размера (Gem), количественное значение
 * регулируется константой MAX
 */
public class HavyGemFactory extends ItemGenerator {

    private final int MAX = 200;

    @Override
    public IGameItem createItem() {
        return new GemIMPL((int)(Math.random()*MAX));
    }
}
