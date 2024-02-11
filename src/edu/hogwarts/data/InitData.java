package edu.hogwarts.data;

import edu.generic.Student;
import edu.generic.Teacher;
import edu.hogwarts.application.StudentController;
import edu.hogwarts.application.TeacherController;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class InitData {

    private  StudentController studentController;
    private TeacherController teacherController;

    public InitData(@NotNull StudentController studentController, @NotNull TeacherController teacherController){
        this.studentController = studentController;
        this.teacherController = teacherController;
    }

    public void initData(){


        House gryffindor = new House("Gryffindor", "Godric Gryffindor", new String[]{"Scarlet", "Gold"});
        House hufflepuff = new House("Hufflepuff","Helga Hufflepuff", new String[]{"Yellow", "Black"});
        House ravenclaw = new House("Ravenclaw", "Rowena Ravenclaw", new String[]{"Blue", "Bronze"});
        House slytherin = new House("Slytherin", "Salazar Slytherin", new String[]{"Green", "Silver"});

        studentController.createStudent(new HogwartsStudent("Harry Potter",11, gryffindor, false));
        studentController.createStudent(new HogwartsStudent("Hermione Granger",12, gryffindor, true));
        studentController.createStudent(new HogwartsStudent("Ronald Weasley",11, gryffindor, true));
        studentController.createStudent(new HogwartsStudent("Hannah Abbott",12, hufflepuff, true));
        studentController.createStudent(new HogwartsStudent("Susan Bones",11, hufflepuff, false));
        studentController.createStudent(new HogwartsStudent("Justin Finch-Fletchley",12, hufflepuff, false));
        studentController.createStudent(new HogwartsStudent("Mandy Brocklehurst",11, ravenclaw, false));
        studentController.createStudent(new HogwartsStudent("Terry Boot",11, ravenclaw, false));
        studentController.createStudent(new HogwartsStudent("Michael Corner",12, ravenclaw, false));
        studentController.createStudent(new HogwartsStudent("Draco Malfoy",11, slytherin, true));
        studentController.createStudent(new HogwartsStudent("Millicent Bulstrode",11, slytherin, false));
        studentController.createStudent(new HogwartsStudent("Tracey Davis",12, slytherin, false));

        teacherController.createTeacher(new HogwartsTeacher("Albus Dumbledore", 90));
        teacherController.createTeacher(new HogwartsTeacher("Minerva McGonagall", 0, gryffindor, true));
        teacherController.createTeacher(new HogwartsTeacher("Pomona Sprout", 0, hufflepuff, true));
        teacherController.createTeacher(new HogwartsTeacher("Filius Flitwick", 33, ravenclaw, true));
        teacherController.createTeacher(new HogwartsTeacher("Severus Snape", 31, slytherin, true));






//        Subject subject = new Subject("Potions",6,true);
//        LocalDate empStartLocal = LocalDate.of(2010, 2, 11);
//        LocalDate empEndLocal = LocalDate.of(2020, 8, 23);
//        Date empStart = Date.from(empStartLocal.atStartOfDay(ZoneId.systemDefault()).toInstant());
//        Date empEnd = Date.from(empEndLocal.atStartOfDay(ZoneId.systemDefault()).toInstant());
//
//        Teacher teacher = new HogwartsTeacher("Horace Slughorn","Teacher", empStart, empEnd,new House("Slytherin","\n" +
//                "Salazar Slytherin",new String[]{"Color 1", "Color2"}), false);
//
//        Student[] students = {
//                new HogwartsStudent("Harry Potter", new House("Gryffindor",
//                        "Godric Gryffindor", new String[]{"Color1", "Color2"}), false, new String[]{"Team1", "Team2"}),
//                new Student("Ron Weasley"),
//                new Student("Draco Malfoy"),
//                new Student("Hermione Granger"),
//                new Student("Ernie Macmillan"),
//                new Student("Padma Patil"),
//                new Student("Percy Weasley"),
//                new Student("Terry Boot"),
//                new Student("Pansy Parkinson"),
//                new Student("Michael Corner"),
//                new Student("Blaise Zabini"),
//                new Student("Theodore Nott")
//        };
//
//        TeachingMaterial[] teachingMaterial = {
//                new TextBook("Advanced Potion-making", "Libatius Borage", "Merge Books", 1946 ),
//                new Tool("Cauldron", "Cauldron Description"),
//                new Tool("Silver knife", "Silver Knife Description"),
//                new Ingredient("Sloth 'brain", 15, "Unit1"),
//                new Ingredient("Scarab beetles", 20, "Unit2"),
//                new Ingredient("Newt spleens", 25, "Unit3"),
//                new Ingredient("Worm wood", 30, "Unit4"),
//                new Ingredient("Knarl quills", 35, "Unit5"),
//        };
//
//        Course course = new Course(subject, teacher, students, teachingMaterial);
//
//        System.out.println(course);
    }
}
