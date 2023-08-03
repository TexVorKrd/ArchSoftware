package Patterns.Factory.RewardFactory;

import Patterns.Factory.RewardFactory.Classes.ItemGenerator;
import Patterns.Factory.RewardFactory.Factores.*;
import Patterns.Factory.RewardFactory.Stuff.Actor;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Демонстрация работы патена Factory
 * Создаем игрока
 * Выводим информацию о валюте
 * наполняем его сундуками через рандомайзер
 * открываем вссе сундуки
 * выводим обновленную информацию о валюте
 */

public class Main {
    public static void main(String[] args) {

        Actor player= new Actor("Василий");

        player.accountInfo();

        randomFiller(player,12);

        player.openAll();

        player.accountInfo();
    }

    /**
     * Рандомайзер заполняет хранилище ирова случайнвыми сундуками с равной вероятностью.
     *
     * @param actor - игрок
     * @param count - колличество сундуков
     */
    public static void randomFiller(Actor actor, int count) {
        Map<Integer, ItemGenerator> factoryPull = new HashMap<>();
        factoryPull.put(0, new GoldFactory());
        factoryPull.put(1, new HavyGoldFactory());
        factoryPull.put(2, new PoorGoldFactory());
        factoryPull.put(3, new GemFactory());
        factoryPull.put(4, new HavyGemFactory());
        factoryPull.put(5, new PoorGemFactory());
        for (int i = 0; i < count; i++) {
            Random rnd = new Random();
            int rndFactory = Math.abs(rnd.nextInt() % 6);
            actor.addTreasures(factoryPull.get(rndFactory).createItem());
        }
    }
}
