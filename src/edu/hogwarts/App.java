package edu.hogwarts;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        var app = new App();
        app.initApp();
    }

    public void initApp(){

        Subject subject = new Subject("Potions",6,true);

        LocalDate empStartLocal = LocalDate.of(2010, 2, 11);
        LocalDate empEndLocal = LocalDate.of(2020, 8, 23);
        Date empStart = Date.from(empStartLocal.atStartOfDay(ZoneId.systemDefault()).toInstant());
        Date empEnd = Date.from(empEndLocal.atStartOfDay(ZoneId.systemDefault()).toInstant());

        Teacher teacher = new HogwartsTeacher("Horace Slughorn","Teacher", empStart, empEnd,new House("Slytherin","\n" +
                "Salazar Slytherin",new String[]{"Color 1", "Color2"}), false);

        Student[] students = {
                new HogwartsStudent("Harry Potter", new House("Gryffindor",
                        "Godric Gryffindor", new String[]{"Color1", "Color2"}), false, new String[]{"Team1", "Team2"}),
                new Student("Ron Weasley"),
                new Student("Draco Malfoy"),
                new Student("Hermione Granger"),
                new Student("Ernie Macmillan"),
                new Student("Padma Patil"),
                new Student("Percy Weasley"),
                new Student("Terry Boot"),
                new Student("Pansy Parkinson"),
                new Student("Michael Corner"),
                new Student("Blaise Zabini"),
                new Student("Theodore Nott")
        };

        TeachingMaterial[] teachingMaterial = {
                new TextBook("Advanced Potion-making", "Libatius Borage", "Merge Books", 1946 ),
                new Tool("Cauldron", "Cauldron Description"),
                new Tool("Silver knife", "Silver Knife Description"),
                new Ingredient("Sloth 'brain", 15, "Unit1"),
                new Ingredient("Scarab beetles", 20, "Unit2"),
                new Ingredient("Newt spleens", 25, "Unit3"),
                new Ingredient("Worm wood", 30, "Unit4"),
                new Ingredient("Knarl quills", 35, "Unit5"),
        };

        Course course = new Course(subject, teacher, students, teachingMaterial);

        System.out.println(course);
    }
}