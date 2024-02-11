package edu.hogwarts.data;

import edu.generic.Student;

import java.util.Arrays;

public class HogwartsStudent extends Student implements HogwartsPerson {

    private House house;
    private boolean prefect;
    private String[] teams;

    public HogwartsStudent() {}

    public HogwartsStudent(House house, boolean prefect, String[] teams) {
        this.house = house;
        this.prefect = prefect;
        this.teams = teams;
    }

    public HogwartsStudent(String fullName, int age, House house, boolean prefect) {
        super(fullName, age);
        this.house = house;
        this.prefect = prefect;
        this.teams = teams;
    }

    public HogwartsStudent(String fullName, int age, House house, boolean prefect, String[] teams) {
        super(fullName, age);
        this.house = house;
        this.prefect = prefect;
        this.teams = teams;
    }

    public HogwartsStudent(String firstName, String middleName, String lastName, int graduationYear, boolean graduated, int enrollmentYear, House house, boolean prefect, String[] teams) {
        super(firstName, middleName, lastName, graduationYear, graduated, enrollmentYear);
        this.house = house;
        this.prefect = prefect;
        this.teams = teams;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public boolean isPrefect() {
        return prefect;
    }

    public void setPrefect(boolean prefect) {
        this.prefect = prefect;
    }

    public String[] getTeams() {
        return teams;
    }

    public void setTeams(String[] teams) {
        this.teams = teams;
    }

    @Override
    public String toString() {
        return "HogwartsStudent{" +
                "house=" + house +
                ", prefect=" + prefect +
                ", teams=" + Arrays.toString(teams) +
                '}';
    }
}
