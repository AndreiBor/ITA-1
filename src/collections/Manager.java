package collections;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    List<User> users = new ArrayList<>();

    boolean login(String login, String password) {
        for (User u : users) {
            if ((u.getLogin().equals(login)) &&
                    (u.getPassword().equals(password))) {
                System.out.print("Есть пользователь с таким логином ("
                        + login + ") и совпадающем паролем. ");
                return true;
            }
        }
        System.out.print("Нет такого пользователя, или связка логин и " +
                "пароль не совпадают. ");
        return false;
    }

    boolean addNewUser(User user) {
        for (User u : users) {
            if (u.equals(user)) {
                System.out.println("Такой пользователь (" + u.login + ")" +
                        " уже существует. ");
                return false;
            }
        }
        users.add(user);
        System.out.println("Пользователь (" + user.login + ") добавлен.");
        return true;
    }

    boolean deleteUser(String login) {
        for (User u : users) {
            if (login.equals(u.getLogin())) {
                users.remove(u);
                System.out.print("Пользователь с логином (" + login + ") " +
                        "удалён. ");
                return true;
            }
        }
        System.out.print("Пользователя с таким логином (" + login + ") " +
                "не существует. ");
        return false;
    }

    void getAllUsers() {
        System.out.println("Все пользователи:");
        for (User u : users) {
            System.out.println(u);
        }
    }

    void getAllUsers(String sortСriterion) {
        /*switch (sortСriterion) {
            case ("login"):
                System.out.println("Сортировка по логину:");
                UserComparatorLogin userComparatorLogin =
                        new UserComparatorLogin();
                users.sort(userComparatorLogin);
                System.out.println(users);
                break;
            case ("date"):
                System.out.println("Сортировка по дате создания:");
                UserComporatorCreatedDate userComporatorCreatedDate =
                        new UserComporatorCreatedDate();
                users.sort(userComporatorCreatedDate);
                System.out.println(users);
                break;
            default:
                System.out.println("Неправильный критерий сортировки");
        }*/
    }

    boolean editUser(User user) {
        User editUser = new User("Изменененный юзер", "Изменененный пароль",
                "Измененанная дата создания");
        for (User u : users) {
            if (u.equals(user)) {
                int index = users.indexOf(user);
                users.set(index, editUser);
                System.out.print("Пользователь (" + u.getLogin() + ") " +
                        "изменен. ");
                return true;
            }
        }
        return false;
    }
}