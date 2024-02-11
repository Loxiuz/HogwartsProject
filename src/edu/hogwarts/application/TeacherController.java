package edu.hogwarts.application;


import edu.generic.Student;
import edu.generic.Teacher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TeacherController {

    public Map<Integer, Teacher> allTeachers = new HashMap<>(); //Kun public indtil create er lavet

    private int lastId = 0;

    public void createTeacher(Teacher teacher){
        lastId++;
        allTeachers.put(lastId, teacher);
    }
    public Teacher getTeacher(int id){
        return allTeachers.get(id);
    }
    public List<Teacher> getAllTeachers(){
        return new ArrayList<>(allTeachers.values());
    }
    public void updateTeacher(int id, Teacher teacher){}
    public void deleteTeacher(int id){}
}
