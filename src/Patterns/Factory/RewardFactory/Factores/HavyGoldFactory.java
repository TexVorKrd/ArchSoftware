package Patterns.Factory.RewardFactory.Factores;

import Patterns.Factory.RewardFactory.Classes.IGameItem;
import Patterns.Factory.RewardFactory.Classes.ItemGenerator;
import Patterns.Factory.RewardFactory.ProdactPrototype.GoldIMPL;

/**
 * Создание обекта (сундука) большого размера (Gold), количественное значение
 * регулируется константой MAX
 */
public class HavyGoldFactory extends ItemGenerator {
    private final int MAX = 1000;

    @Override
    public IGameItem createItem() {
        return new GoldIMPL((int)(Math.random()*MAX));
    }
}
