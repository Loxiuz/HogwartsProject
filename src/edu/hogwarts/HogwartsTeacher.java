package edu.hogwarts;

public class HogwartsTeacher extends Teacher implements HogwartsPerson {

    private House house;
    private boolean headOfHouse;

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public boolean isHeadOfHouse() {
        return headOfHouse;
    }

    public void setHeadOfHouse(boolean headOfHouse) {
        this.headOfHouse = headOfHouse;
    }
}
