package edu.generic;

import java.util.Date;

public class Teacher extends Person {

    private String empType;
    private Date employmentStart;
    private Date employmentEnd;

    public Teacher(String empType, Date employmentStart, Date employmentEnd) {
        this.empType = empType;
        this.employmentStart = employmentStart;
        this.employmentEnd = employmentEnd;
    }

    public Teacher(String fullName, String empType, Date employmentStart, Date employmentEnd) {
        super(fullName);
        this.empType = empType;
        this.employmentStart = employmentStart;
        this.employmentEnd = employmentEnd;
    }

    public Teacher(String firstName, String lastName, String empType, Date employmentStart, Date employmentEnd) {
        super(firstName, lastName);
        this.empType = empType;
        this.employmentStart = employmentStart;
        this.employmentEnd = employmentEnd;
    }

    public Teacher(String firstName, String middleName, String lastName, String empType, Date employmentStart, Date employmentEnd) {
        super(firstName, middleName, lastName);
        this.empType = empType;
        this.employmentStart = employmentStart;
        this.employmentEnd = employmentEnd;
    }

    public String getEmpType() {
        return empType;
    }

    public void setEmpType(String empType) {
        this.empType = empType;
    }

    public Date getEmploymentStart() {
        return employmentStart;
    }

    public void setEmploymentStart(Date employmentStart) {
        this.employmentStart = employmentStart;
    }

    public Date getEmploymentEnd() {
        return employmentEnd;
    }

    public void setEmploymentEnd(Date employmentEnd) {
        this.employmentEnd = employmentEnd;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "empType='" + empType + '\'' +
                ", employmentStart=" + employmentStart +
                ", employmentEnd=" + employmentEnd +
                '}';
    }
}
