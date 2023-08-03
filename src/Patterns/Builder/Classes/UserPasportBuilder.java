package Patterns.Builder.Classes;

import Patterns.Builder.ConcreteItem.UserPasport;

/**
 * Методы для сбора информации которые должны быть реализованы
 * Сбор информации зависит от конкретной реализации.
 */
public interface UserPasportBuilder {

    public abstract UserPasportBuilder firstNameBuilder();

    public abstract UserPasportBuilder secondNameBuilder();

    public abstract UserPasportBuilder yearOfBirthdayBuilder();

    public abstract UserPasportBuilder nickNameBuilder();

    public abstract UserPasportBuilder emailBuilder();

    public abstract UserPasport getResult();

}
