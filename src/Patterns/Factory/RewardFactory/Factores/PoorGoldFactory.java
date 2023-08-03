package Patterns.Factory.RewardFactory.Factores;

import Patterns.Factory.RewardFactory.Classes.IGameItem;
import Patterns.Factory.RewardFactory.Classes.ItemGenerator;
import Patterns.Factory.RewardFactory.ProdactPrototype.GoldIMPL;
/**
 * Создание обекта (сундука) маленького размера (Gold), количественное значение
 * регулируется константой MAX
 */
public class PoorGoldFactory extends ItemGenerator {
    private final int MAX = 250;

    @Override
    public IGameItem createItem() {
        return new GoldIMPL((int)(Math.random()*MAX));
    }
}
