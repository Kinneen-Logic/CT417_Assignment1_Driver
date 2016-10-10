/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nuigalway.ct417_assignment1_driver;


import org.joda.time.DateTime;

import com.nuigalway.ct417_assignment1_classes.CourseProgramme;
import com.nuigalway.ct417_assignment1_classes.Module;
import com.nuigalway.ct417_assignment1_classes.Student;


/**
 *
 * @author Me
 */
public class StudentDriver {
    
    public static void main(String[] args) {
    	CourseProgramme ece = new CourseProgramme("Electronic and Computer Engineering", new DateTime(2013, 1, 9, 0, 0), new DateTime(2017, 5, 31, 0, 0) );
        CourseProgramme eee = new CourseProgramme("Electronic and Electrical Engineering", new DateTime(2013, 1, 9, 0, 0), new DateTime(2017, 5, 31, 0, 0) );         
        CourseProgramme csAndIT = new CourseProgramme("Electronic and Computer Engineering", new DateTime(2013, 1, 9, 0, 0), new DateTime(2017, 5, 31, 0, 0) );
    	
    	Student aidan = new Student("aidan", 20, new DateTime(1995, 12, 7, 0, 0) , 13539243, ece);
        Student ronan = new Student("ronan", 18, new DateTime(1997, 10, 9, 0, 0) , 15843597, eee);
        Student simon = new Student("simon", 20, new DateTime(1995, 11, 12, 0, 0) , 17624678, csAndIT);
        Student jimbo = new Student("jimbo", 22, new DateTime(1993, 12, 1, 0, 0) , 19324987, ece);
        
        Module maths = new Module("maths", "CT123");
        Module softwareEng = new Module("Software Engineering III", "CT417");
        Module dsp = new Module("Digital Signal Processing", "EE345");
        Module algorithm = new Module("Algorithm Analysis", "CT876");
        Module electronics = new Module("Algorithm Analysis", "CT876");
        
        ece.addModule(algorithm);
        ece.addModule(dsp);
        
        
        printStudent(aidan, ronan, simon, jimbo);
    }
    
    private static void printStudent(Student...students) {
    	for (Student student : students) {
    		System.out.printf("%s%n%n", student);
    	}
    }
    
}