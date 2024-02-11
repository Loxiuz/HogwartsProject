package edu.generic;

public class Person {

    private String firstName;
    private String middleName;
    private String lastName;
    private int age;

    //Constructors

    public Person() {}

    public Person(String fullName) {
        setFullName(fullName);
    }

    public Person(String fullName, int age) {
        setFullName(fullName);
        this.age = age;
    }

    public Person(String firstName, String lastName) {
        this(firstName, null, lastName);
    }

    public Person(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    //Getters and setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFullName(String fullName) {
        String[] fullNameArr = fullName.split(" ");
        firstName = fullNameArr[0];
        lastName = fullNameArr[fullNameArr.length - 1];

        if (fullNameArr.length > 2) {
            middleName = fullNameArr[1];
        } else {
            middleName = null;
        }
    }

    public String getFullName() {
        if (hasMiddleName()) {
            return firstName + " " + middleName + " " + lastName;
        } else {
            return firstName + " " + lastName;
        }
    }


    public boolean hasMiddleName() {
        return middleName != null && !middleName.isEmpty();
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

