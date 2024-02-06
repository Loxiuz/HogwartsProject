package edu.hogwarts;

public class Student extends Person {

    private int graduationYear;
    private boolean graduated;
    private int enrollmentYear;

    public Student(){}

    public Student(String fullName) {
        setFullName(fullName);
    }

    public Student(
            String firstName,
            String middleName,
            String lastName,
            int graduationYear,
            boolean graduated,
            int enrollmentYear
    ) {
        super(firstName, middleName, lastName);
        this.graduationYear = graduationYear;
        this.graduated = graduated;
        this.enrollmentYear = enrollmentYear;
    }

    public int getEnrollmentYear() {
        return enrollmentYear;
    }

    public void setEnrollmentYear(int enrollmentYear) {
        this.enrollmentYear = enrollmentYear;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }

    public boolean isGraduated() {
        return graduated;
    }

    public void setGraduated(boolean graduated) {
        this.graduated = graduated;
    }

    @Override
    public String toString() {
        return "Student{" +
                "graduationYear=" + graduationYear +
                ", graduated=" + graduated +
                ", enrollmentYear=" + enrollmentYear +
                '}';
    }
}
