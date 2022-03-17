package main;

import models.*;

import java.util.ArrayList;

public class VeA_IS {
    public static ArrayList<Professor> profLists= new ArrayList<>();
    public static ArrayList<Student> studLists= new ArrayList<>();
    public static ArrayList<Grade> gradeLists= new ArrayList<>();
    public static ArrayList<Course> courseLists= new ArrayList<>();


    public static void main(String[] args)
    {
        models.Professor professor_1 =  new Professor("Karina", "Skirmante", ProfDegree.master);
        models.Professor professor_2 =  new Professor();
        models.Professor professor_3 =  new Professor();

        models.Course course_1 = new Course("Java", (byte) 4, professor_1);
        models.Course course_2 = new Course();
        models.Course course_3 = new Course();



        models.Student student_1 = new Student("Janis", "Berzins");
        models.Student student_2 = new Student();
        models.Student student_3 = new Student();


        models.Grade grade_1 = new Grade(course_1, student_1, (byte)10);
        models.Grade grade_2 = new Grade();
        models.Grade grade_3 = new Grade();



        profLists.add(professor_1);
        studLists.add(student_1);
        gradeLists.add(grade_1);
        courseLists.add(course_1);

        System.out.println(profLists);
        System.out.println(studLists);
        System.out.println(gradeLists);
        System.out.println(courseLists);

    }

    public void averageGrade()
    {

    }
}
