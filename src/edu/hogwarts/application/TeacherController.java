package edu.hogwarts.application;


import edu.generic.Student;
import edu.generic.Teacher;
import edu.hogwarts.data.HogwartsTeacher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TeacherController {

    private Map<Integer, HogwartsTeacher> allTeachers = new HashMap<>();

    private int lastId = 0;

    public void createTeacher(HogwartsTeacher teacher){
        lastId++;
        allTeachers.put(lastId, teacher);
    }
    public Teacher getTeacher(int id){
        return allTeachers.get(id);
    }
    public List<HogwartsTeacher> getAllTeachers(){
        return new ArrayList<>(allTeachers.values());
    }
    public void updateTeacher(int id, Teacher teacher){}
    public void deleteTeacher(int id){}
}
