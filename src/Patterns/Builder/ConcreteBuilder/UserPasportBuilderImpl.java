package Patterns.Builder.ConcreteBuilder;

import Patterns.Builder.ConcreteItem.UserPasport;

import java.util.Scanner;

/**
 * Конкретный строитель анкетных данных пользователя.
 */
public class UserPasportBuilderImpl implements Patterns.Builder.Classes.UserPasportBuilder {
    String firstName;
    String secondName;
    int yearOfBirthday;
    String nickName;
    String email;

    public UserPasportBuilderImpl() {
    }

    @Override
    public Patterns.Builder.Classes.UserPasportBuilder firstNameBuilder() {
        System.out.println("Введите имя");
        this.firstName = new Scanner(System.in).nextLine();
        return this;
    }

    @Override
    public Patterns.Builder.Classes.UserPasportBuilder secondNameBuilder() {
        System.out.println("Введите фамилию");
        this.secondName = new Scanner(System.in).nextLine();
        return this;
    }

    @Override
    public Patterns.Builder.Classes.UserPasportBuilder yearOfBirthdayBuilder() {
        System.out.println("Введите год рождения");
        this.yearOfBirthday = new Scanner(System.in).nextInt();
        return this;
    }

    @Override
    public Patterns.Builder.Classes.UserPasportBuilder nickNameBuilder() {
        System.out.println("Введите никнейм");
        this.nickName = new Scanner(System.in).nextLine();
        return this;
    }

    @Override
    public Patterns.Builder.Classes.UserPasportBuilder emailBuilder() {
        System.out.println("Введите емайл");
        this.email = new Scanner(System.in).nextLine();
        return this;
    }

    @Override
    public UserPasport getResult() {
        UserPasport userPasport = new UserPasport(firstName, secondName, yearOfBirthday, nickName, email);
        return userPasport;
    }
}
