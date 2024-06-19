package web.controller;

public class Car {
    private String name;
    private String shortName;
    private int dateOfBirth;

    public Car() {
    }

    public Car(String shortName, String name, int dateOfBirth) {
        this.name = name;
        this.shortName = shortName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
