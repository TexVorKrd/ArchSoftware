package Patterns.Factory.RewardFactory.Factores;

import Patterns.Factory.RewardFactory.Classes.IGameItem;
import Patterns.Factory.RewardFactory.Classes.ItemGenerator;
import Patterns.Factory.RewardFactory.ProdactPrototype.GemIMPL;

/**
 * Создание обекта (сундука) маленького размера (Gem), количественное значение
 * регулируется константой MAX
 */
public class PoorGemFactory extends ItemGenerator {
    private final int MAX = 50;


    @Override
    public IGameItem createItem() {
        return new GemIMPL((int)(Math.random()*MAX));
    }
}
