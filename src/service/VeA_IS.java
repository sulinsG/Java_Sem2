package service;

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
        models.Professor professor_2 =  new Professor("Brokastis", "Norita", ProfDegree.bachelor);
        models.Professor professor_3 =  new Professor("Liels", "Varbuttomermazs", ProfDegree.doctor);
        profLists.add(professor_1);
        profLists.add(professor_2);
        profLists.add(professor_3);

        models.Course course_1 = new Course("Java", (byte) 4, professor_1);
        models.Course course_2 = new Course();
        models.Course course_3 = new Course();
        courseLists.add(course_1);
        courseLists.add(course_2);
        courseLists.add(course_3);


        models.Student student_1 = new Student("Janis", "Berzins");
        models.Student student_2 = new Student("Berzins", "Janis");
        models.Student student_3 = new Student("JanisBerzins", "Janis");
        studLists.add(student_1);
        studLists.add(student_2);
        studLists.add(student_3);

        models.Grade grade_1 = new Grade(course_1, student_1, (byte)10);
        models.Grade grade_2 = new Grade(course_2, student_1, (byte)5);
        models.Grade grade_3 = new Grade(course_3, student_1, (byte) 1);
        gradeLists.add(grade_1);
        gradeLists.add(grade_2);
        gradeLists.add(grade_3);



        System.out.println(profLists);
        System.out.println(studLists);
        System.out.println(gradeLists);
        System.out.println(courseLists);





    }

    public void averageGrade()
    {

    }
}
