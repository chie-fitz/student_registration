/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Studentregsystem;
import java.util.ArrayList;
/**
 *
 * @author chiefitzmaurice
 */
public class Module {
    
    private String Name;
    private String ID;
    private ArrayList StudentList;
    private ArrayList AssociatedCourseList;

public Module(String name, String id, ArrayList students, ArrayList associatedCourse){
    this.Name = name;
    this.ID = id;
    this.StudentList = students;
    this.AssociatedCourseList = associatedCourse;
}

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public ArrayList getStudentList() {
        return StudentList;
    }

    public void setStudentList(ArrayList StudentList) {
        this.StudentList = StudentList;
    }

    public void addToStudentList(Student s){
        this.StudentList.add(s);
    }
    
    public ArrayList getAssociatedCourseList() {
        return AssociatedCourseList;
    }

    public void setAssociatedCourseList(ArrayList AssociatedCourseList) {
        this.AssociatedCourseList = AssociatedCourseList;
    }

   
    
}
