package com.maven;

import java.util.*;
import com.maven.dao.*;
import com.maven.model.*;
public class App 
{
    public static void main( String[] args )
    {
    	StudentDao studentDao = new StudentDao();

        // test saveStudent
        Student student1=new Student("Anita","Shinde","anita123@gmail.com");
        Student student2 =new Student("Omkar","Shinde","omkar123@gmail.com");
        Student student3 =new Student("Shruti","Pingale","shruti123@gmail.com");
        //passing value in parameterized constructor
        studentDao.saveStudent(student1);
        studentDao.saveStudent(student2);
        studentDao.saveStudent(student3);
        
        // test updateStudent
        student1.setFirstName("Panali");
        studentDao.updateStudent(student1);
        
        student2.setEmail("pranali123@gmail.com");
        studentDao.updateStudent(student2);
        
        student3.setFirstName("Prakash");
        studentDao.updateStudent(student3);
        
        student1.setEmail("Prakash123@gmail.com");
        studentDao.updateStudent(student1);
        
        // test getStudentById
        //Student student2 = studentDao.getStudentById(student.getId());

        // test getAllStudents
        List < Student > students = studentDao.getAllStudents();
        students.forEach(stud -> System.out.println(student1.getId()));
        // -> lambda expression left side of arrow:parameter ; right:value
        
        // test deleteStudent
        studentDao.deleteStudent(1);

    }
    }



