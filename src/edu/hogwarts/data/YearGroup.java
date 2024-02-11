package edu.hogwarts.data;

import edu.generic.Student;

import java.util.Arrays;
import java.util.Date;

public class YearGroup {

    private int schoolYear;
    private Date beginningOfSchoolYear;
    private Student[] students;

    public YearGroup(int schoolYear, Date beginningOfSchoolYear, Student[] students) {
        this.schoolYear = schoolYear;
        this.beginningOfSchoolYear = beginningOfSchoolYear;
        this.students = students;
    }

    public int getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(int schoolYear) {
        this.schoolYear = schoolYear;
    }

    public Date getBeginningOfSchoolYear() {
        return beginningOfSchoolYear;
    }

    public void setBeginningOfSchoolYear(Date beginningOfSchoolYear) {
        this.beginningOfSchoolYear = beginningOfSchoolYear;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "YearGroup{" +
                "schoolYear=" + schoolYear +
                ", beginningOfSchoolYear=" + beginningOfSchoolYear +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
