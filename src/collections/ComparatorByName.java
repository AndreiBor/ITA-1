package collections;

import java.util.Comparator;

public class ComparatorByName implements Comparator<MyClass> {
    public int compare(MyClass o1, MyClass o2) {
        return  o1.getName().compareTo(o2.getName());
    }
}