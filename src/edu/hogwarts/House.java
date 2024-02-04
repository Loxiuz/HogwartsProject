package edu.hogwarts;

import java.util.Arrays;

public class House {

    private String name;
    private String founder;
    private String[] color;

    public House(String name, String founder, String[] color) {
        this.name = name;
        this.founder = founder;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public String[] getColor() {
        return color;
    }

    public void setColor(String[] color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "House{" +
                "name='" + name + '\'' +
                ", founder='" + founder + '\'' +
                ", color=" + Arrays.toString(color) +
                '}';
    }
}
