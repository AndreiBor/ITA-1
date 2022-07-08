package stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class Test {
    public static void main(String[] args) {
        long count = IntStream.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5).filter(w -> w > 0).count();
        System.out.println(count);


        System.out.println(Stream.of("a1", "a2", "a3").filter("a1"::equals).count());

        Collection<Integer> collection = new ArrayList();
        collection.add(1);
        collection.add(3);
        collection.add(10);
        collection.add(3);
        collection.add(15);
        System.out.println(collection.stream().skip(collection.size() - 1).findFirst().orElse(1));
        Integer i = (Integer) collection.stream().findAny().orElse(1);
        System.out.println("i = " + i);

        System.out.println(collection.stream().distinct().collect(Collectors.toList()));

        System.out.println(collection.stream().map((s) -> s + "_1").collect(Collectors.toList()));
        Stream<String> streamStr = collection.stream().map((s) -> s + "_a");

        streamStr.peek((e) -> System.out.print(e)).
                collect(Collectors.toList());
        System.out.println();
        System.out.println(collection.stream().limit(2).collect(Collectors.toList()));


        System.out.println(collection.stream().sorted().collect(Collectors.toList()));

        Collection<String> collection2 = new ArrayList();
        collection2.add("skdjf,sdlkfj,sdaf");
        collection2.add("111,22,33");
        System.out.println(collection2.stream().flatMap((p) -> asList(p.split(",")).stream()).collect(Collectors.toList()));


        List<Human> humans = asList(
                new Human("Sam", asList("Buddy", "Lucy")),
                new Human("Bob", asList("Frankie", "Rosie")),
                new Human("Marta", asList("Simba", "Tilly")));

        List<String> petNames = humans.stream()
                .map(human -> human.getPets()) //преобразовываем Stream<Human> в Stream<List<Pet>>
                .flatMap(pets -> pets.stream())//"разворачиваем" Stream<List<Pet>> в Stream<Pet>
                .collect(Collectors.toList());

        System.out.println(petNames); // output [Buddy, Lucy, Frankie, Rosie, Simba, Tilly]

        collection2.stream().forEach((p) -> p.toLowerCase());

        System.out.println(collection.stream().reduce((s1, s2) -> s1 + s2).orElse(0));


    }
}
class Human {
    private final String name;
    private final List<String> pets;

    public Human(String name, List<String> pets) {
        this.name = name;
        this.pets = pets;
    }

    public String getName() {
        return name;
    }

    public List<String> getPets() {
        return pets;
    }

}