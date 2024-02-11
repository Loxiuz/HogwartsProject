package edu.hogwarts.application;

import edu.generic.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentController {

    public Map<Integer, Student> allStudents = new HashMap<>(); //Kun public indtil create er lavet
    private int lastId = 0;

    public void createStudent(Student student){
        lastId++;
        allStudents.put(lastId, student);
    }
    public Student getStudent(int id){
        return allStudents.get(id);
    }
    public List<Student> getAllStudents(){
        return new ArrayList<>(allStudents.values());
    }
    public void updateStudent(int id, Student student){}
    public void deleteStudent(int id){}
}
