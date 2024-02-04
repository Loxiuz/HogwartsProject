package edu.hogwarts;

import java.util.Date;

public class HogwartsTeacher extends Teacher implements HogwartsPerson {

    private House house;
    private boolean headOfHouse;

    public HogwartsTeacher(String empType, Date employmentStart, Date employmentEnd, House house, boolean headOfHouse) {
        super(empType, employmentStart, employmentEnd);
        this.house = house;
        this.headOfHouse = headOfHouse;
    }

    public HogwartsTeacher(String fullName, String empType, Date employmentStart, Date employmentEnd, House house, boolean headOfHouse) {
        super(fullName, empType, employmentStart, employmentEnd);
        this.house = house;
        this.headOfHouse = headOfHouse;
    }

    public HogwartsTeacher(String firstName, String lastName, String empType, Date employmentStart, Date employmentEnd, House house, boolean headOfHouse) {
        super(firstName, lastName, empType, employmentStart, employmentEnd);
        this.house = house;
        this.headOfHouse = headOfHouse;
    }

    public HogwartsTeacher(String firstName, String middleName, String lastName, String empType, Date employmentStart, Date employmentEnd, House house, boolean headOfHouse) {
        super(firstName, middleName, lastName, empType, employmentStart, employmentEnd);
        this.house = house;
        this.headOfHouse = headOfHouse;
    }

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

    @Override
    public String toString() {
        return "HogwartsTeacher{" +
                "house=" + house +
                ", headOfHouse=" + headOfHouse +
                '}';
    }
}
