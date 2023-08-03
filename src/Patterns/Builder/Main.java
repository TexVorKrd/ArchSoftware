package Patterns.Builder;

import Patterns.Builder.Classes.UserPasportDirector;
import Patterns.Builder.ConcreteBuilder.UserPasportBuilderImpl;
import Patterns.Builder.ConcreteItem.UserPasport;

/**
 * Демонстрация раоты патерна Builder
 */

public class Main {
    public static void main(String[] args) {

        UserPasportDirector uDirector = new UserPasportDirector(new UserPasportBuilderImpl());

        UserPasport pasport1 = uDirector.oneClick();
        System.out.println(pasport1.toString());

        UserPasport pasport2 = uDirector.goodInfo();
        System.out.println(pasport2.toString());

        UserPasport pasport3 = uDirector.fullInfo();
        System.out.println(pasport3.toString());
    }
}
