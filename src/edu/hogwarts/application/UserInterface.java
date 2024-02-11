package edu.hogwarts.application;

import edu.generic.Person;
import edu.generic.Student;
import edu.generic.Teacher;
import edu.hogwarts.data.HogwartsPerson;
import edu.hogwarts.data.HogwartsStudent;
import edu.hogwarts.data.HogwartsTeacher;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class UserInterface {

    private StudentController studentController;
    private TeacherController teacherController;

    public UserInterface(@NotNull StudentController studentController, @NotNull TeacherController teacherController){
        this.studentController = studentController;
        this.teacherController = teacherController;
    }

    public void start(){
        createHeader();
        showData(studentController.getAllStudents(), teacherController.getAllTeachers());

    }

    public void getUserInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type 's' to sort. \n");
        System.out.println("Type 'f' to filter. \n");
        String input = scanner.nextLine();
        if(Objects.equals(input, "s")){
            System.out.println("Choose sorting by typing number: \n");
            System.out.println("1. First Name");
            System.out.println("2. Middle Name");
            System.out.println("3. Last Name");
            System.out.println("3. Age");
            System.out.println("4. House");
            System.out.println("5. Role");
            switch (scanner.nextInt()){
                case 1:
            }
        } else if(Objects.equals(input, "f")) {

        } else {
            System.out.println("Invalid input");
        }
    }

    public List<HogwartsPerson> sortList(){

    }

    public void createHeader(){
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.println("|      First Name       |       Middle Name       |      Last Name       |  Age |    House    | Role      |");
        System.out.println("-----------------------------------------------------------------------------------------------------------");
    }

    public void showData(List<HogwartsStudent> allStudents, List<HogwartsTeacher> allTeachers){
        //Only works if teachers list is smaller than students
        List<Person> allPeople = new ArrayList<>();
        allPeople.addAll(allStudents);
        allPeople.addAll(allTeachers);
        for (Person person : allPeople) {
            if (person.getHouse() == null) {
                System.out.printf("|    %s    |     %s     |       %s      |   %d   |       %s      |  Teacher |\n", person.getFirstName(), person.getMiddleName(), person.getLastName(), person.getAge(), "null");
            }
            System.out.printf("|    %s    |     %s     |       %s      |   %d   |       %s      |  Student |\n", person.getFirstName(), person.getMiddleName(), person.getLastName(), person.getAge(), person.getHouse().getName());
        }
    }
}
