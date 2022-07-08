package javaio;

import java.io.Serializable;
import java.util.Objects;

public class House implements Serializable {
    private String address;

    public House(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return Objects.equals(address, house.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address);
    }
}
