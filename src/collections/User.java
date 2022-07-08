package collections;


import java.time.LocalDate;
import java.util.Objects;

public class User {
    String login;
    String password;
    String createdDate;

    public User(String login, String password, String createdDate) {
        this.login = login;
        this.password = password;
        this.createdDate = createdDate;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    @Override
    public String toString() {
        return "User: " +
                "login=(" + login +
                "), password=(" + password +
                ')' +
                ", createdDate=(" + createdDate +
                ')';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password);
    }
}