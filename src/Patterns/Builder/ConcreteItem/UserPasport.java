package Patterns.Builder.ConcreteItem;

/**
 * Анкетные данные пользователя
 */
public class UserPasport {
    String firstName;
    String secondName;
    int yearOfBirthday;
    String nickName;
    String email;

    public UserPasport(String firstName, String secondName, int yearOfBirthday, String nickName, String email) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.yearOfBirthday = yearOfBirthday;
        this.nickName = nickName;
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserPasport{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", yearOfBirthday=" + yearOfBirthday +
                ", nickName='" + nickName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
