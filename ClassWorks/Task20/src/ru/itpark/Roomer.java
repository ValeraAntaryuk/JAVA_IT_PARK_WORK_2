package ru.itpark;

public class Roomer {
    private String roomerName;
    private int flatNumber;

    public Roomer(String roomerName, int flatNumber) {
        this.roomerName = roomerName;
        this.flatNumber = flatNumber;
    }

    public String getRoomerName() {
        return roomerName;
    }

    public void setRoomerName(String roomerName) {
        this.roomerName = roomerName;
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }
}
