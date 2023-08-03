package Patterns.Builder.Classes;

import Patterns.Builder.ConcreteItem.UserPasport;

/**
 * менеджер сборки объекта по сценариям и конкретным строителем.
 */
public class UserPasportDirector {
    private UserPasportBuilder builder;

    public UserPasportDirector(UserPasportBuilder builder) {
        this.builder = builder;
    }

    public UserPasport oneClick() {
        return builder.nickNameBuilder().emailBuilder().getResult();
    }

    public UserPasport goodInfo() {
        return builder.firstNameBuilder().secondNameBuilder().emailBuilder().nickNameBuilder().getResult();
    }

    public UserPasport fullInfo() {
        return builder.firstNameBuilder().secondNameBuilder().emailBuilder().nickNameBuilder().yearOfBirthdayBuilder().getResult();
    }
}
