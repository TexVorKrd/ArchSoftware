package Patterns.Factory.RewardFactory.Classes;

import Patterns.Factory.RewardFactory.Stuff.GetebleCurensy;

/**
 * объект(сундук) который должен реализовать метод открытия open()
 * и возвращать объект который имеет количественное значение через метод get()
 * через интерфейс GetebleCurensy
 */
public interface IGameItem {
    public GetebleCurensy open();

}
