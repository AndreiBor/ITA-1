package collections;

import java.util.*;

class Business {
}

class Hotel extends Business {
}

class Inn extends Hotel {
}

public class Travel {
    ArrayList<Hotel> go() {
        return new ArrayList<Hotel>();
    }

    public static void main(String[] args) {
        System.out.println(new Travel().go());
        ArrayList<Business> a = new ArrayList<Business>();
    }
}