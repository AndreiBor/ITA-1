package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {

    public static void main(String[] args) {
        List<People> peoples = Arrays.asList(
                new People("Вася", 16, Sex.MAN),
                new People("Петя", 23, Sex.MAN),
                new People("Елена", 42, Sex.WOMAN),
                new People("Артем", 26, Sex.MAN),
                new People("Маша", 17, Sex.WOMAN),
                new People("Кирилл", 87, Sex.MAN),
                new People("Иван Иванович", 69, Sex.MAN));

        List<People> peoplesArmy = peoples.stream()
                .filter(p -> p.getAge() > 18 && p.getAge() < 27 && p.getSex().equals(Sex.MAN))
                .peek(p -> System.out.println(p.getName()))
                .collect(Collectors.toList());

        double menAverageAge = peoples.stream().filter(p -> p.getSex().equals(Sex.MAN))
                .mapToInt(People::getAge).average().getAsDouble();

        System.out.println(menAverageAge);

        long countWork = peoples.stream().
                filter(p -> (p.getAge() > 18 && p.getAge() < 60 && p.getSex().equals(Sex.MAN))
                        || (p.getAge() > 18 && p.getAge() < 55 && p.getSex().equals(Sex.WOMAN)))
                .peek(p -> System.out.println(p.getName()))
                .count();
        System.out.println(countWork);

    }




}

class People {
    private String name;
    private int age;
    private Sex sex;

    public People(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}

enum Sex {
    MAN, WOMAN;
}
