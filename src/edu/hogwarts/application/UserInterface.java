package edu.hogwarts.application;

import edu.hogwarts.data.HogwartsPerson;
import edu.hogwarts.data.HogwartsPersonComparator;
import edu.hogwarts.data.HogwartsPersonSortBy;
import edu.hogwarts.data.House;
import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.stream.Collectors;

public class UserInterface {

    private StudentController studentController;
    private TeacherController teacherController;
    private List<HogwartsPerson> allPersons;

    public UserInterface(@NotNull StudentController studentController, @NotNull TeacherController teacherController){
        this.studentController = studentController;
        this.teacherController = teacherController;
    }

    public void start(){
        setAllPersons();
        showData(allPersons);
        userInput();
    }

    public void setAllPersons(){
        allPersons = new ArrayList<>();
        allPersons.addAll(studentController.getAllStudents());
        allPersons.addAll(teacherController.getAllTeachers());
    }

    public void userInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nType 's' to sort.");
        System.out.println("Type 'f' to filter.");
        System.out.println("Type 'r' to reset view.");
        System.out.println("Type 'e' to exit.");
        String input = scanner.nextLine();
        switch (input){
            case "s" -> {
                System.out.println("Choose sorting by typing number:");
                System.out.println("1. First Name");
                System.out.println("2. Middle Name");
                System.out.println("3. Last Name");
                System.out.println("4. Age");
                System.out.println("5. House");
                System.out.println("6. Role");
                switch (scanner.nextInt()){
                    case 1 -> allPersons.sort(new HogwartsPersonComparator(HogwartsPersonSortBy.FIRST_NAME));
                    case 2 -> allPersons.sort(new HogwartsPersonComparator(HogwartsPersonSortBy.MIDDLE_NAME));
                    case 3 -> allPersons.sort(new HogwartsPersonComparator(HogwartsPersonSortBy.LAST_NAME));
                    case 4 -> allPersons.sort(new HogwartsPersonComparator(HogwartsPersonSortBy.AGE));
                    case 5 -> allPersons.sort(new HogwartsPersonComparator(HogwartsPersonSortBy.HOUSE));
                    case 6 -> allPersons.sort(new HogwartsPersonComparator(HogwartsPersonSortBy.ROLE));
                    default -> System.out.println("Invalid input");
                }
                showData(allPersons);
                userInput();
            }
            case "f" -> {
                System.out.println("Choose filter by typing number:");
                System.out.println("1. House");
                System.out.println("2. Role");
                switch (scanner.nextInt()){
                    //House
                    case 1 -> {
                        System.out.println("Choose house name:");
                        System.out.println("1. Gryffindor");
                        System.out.println("2. Hufflepuff");
                        System.out.println("3. Ravenclaw");
                        System.out.println("4. Slytherin");
                        switch (scanner.nextInt()) {
                            case 1 -> {
                                showData(filteredList(allPersons, "Gryffindor", "H", ""));
                                userInput();
                            }
                            case 2 ->{
                                showData(filteredList(allPersons, "Hufflepuff", "H", ""));
                                userInput();
                            }
                            case 3 ->{
                                showData(filteredList(allPersons, "Ravenclaw", "H", ""));
                                userInput();
                            }
                            case 4 ->{
                                showData(filteredList(allPersons, "Slytherin", "H", ""));
                                userInput();
                            }
                            default -> System.out.println("Invalid input");
                        }
                    }
                    //Role
                    case 2 -> {
                        System.out.println("Choose role:");
                        System.out.println("1. Student");
                        System.out.println("1. Teacher");
                        switch (scanner.nextInt()){
                            case 1 -> {
                                showData(filteredList(allPersons, "", "R", "Student"));
                                userInput();
                            }
                            case 2 -> {
                                showData(filteredList(allPersons, "", "R", "Teacher"));
                                userInput();
                            }
                        }
                    }
                    default -> System.out.println("Invalid input");
                }

                userInput();
            }
            case "r" -> {
                showData(allPersons);
                userInput();
            }
            case "e" -> System.out.println("Exiting");
            default -> System.out.println("Invalid input");
        }
    }

    public List<HogwartsPerson> filteredList(List<HogwartsPerson> persons, String houseName, String filter, String role){
        List<HogwartsPerson> filteredList = new ArrayList<>();

        if(Objects.equals(filter, "H")){
            filteredList = persons.stream()
                    .filter(p -> {
                        //In case house is null
                        House house = Objects.requireNonNullElse(p.getHouse(), new House(""));
                        return house.getName().equals(houseName);
                    })
                    .collect(Collectors.toList());

        } else if (Objects.equals(filter, "R")){
            filteredList = persons.stream()
                    .filter(p -> p.getRole().equals(role))
                    .collect(Collectors.toList());
        }
        return filteredList;
    }

    public void showData(List<HogwartsPerson> persons){
        System.out.println("--------------------------------------------------------");
        System.out.println("| First Name, Middle Name, Last Name, Age, House, Role |");
        System.out.println("--------------------------------------------------------");
        //Only works if teachers list is smaller than students
        for (HogwartsPerson person: persons) {
            if (person.getHouse() == null) {
                System.out.printf("| %s, %s, %s %d %s %s |\n",
                        person.getFirstName(), person.getMiddleName(), person.getLastName(), person.getAge(), "null", person.getRole()
                );
            } else {
                System.out.printf(
                        "| %s, %s, %s, %d, %s, %s |\n",
                        person.getFirstName(), person.getMiddleName(), person.getLastName(), person.getAge(), person.getHouse().getName(), person.getRole()
                );
            }
        }
    }
}
