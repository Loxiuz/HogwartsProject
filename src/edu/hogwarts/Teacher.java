package edu.hogwarts;

import java.util.Date;

public class Teacher extends Person {

    private String empType; //String eller anden ny klasse?
    private Date employmentStart;
    private Date employmentEnd;

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
}
