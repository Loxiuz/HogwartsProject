package edu.hogwarts.application;

import edu.generic.Student;
import edu.hogwarts.data.HogwartsStudent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentController {

    private final Map<Integer, HogwartsStudent> allStudents = new HashMap<>();
    private int lastId = 0;

    public void createStudent(HogwartsStudent student){
        lastId++;
        allStudents.put(lastId, student);
    }
    public Student getStudent(int id){
        return allStudents.get(id);
    }
    public List<HogwartsStudent> getAllStudents(){
        return new ArrayList<>(allStudents.values());
    }
    public void updateStudent(int id, Student student){}
    public void deleteStudent(int id){}
}
