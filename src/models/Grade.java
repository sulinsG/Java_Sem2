package models;

public class Grade {
    //1. mainīgie
    private int id;
    private static int idCounter = 100000;

    private byte gradeValue;
    private Student student;
    private Course course;
    //2.1 get funkcijas

    public int getId() {
        return id;
    }

    public byte getGradeValue() {
        return gradeValue;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }


    //2.2 set funkcijas
    private void setId() {
        this.id = idCounter;
        idCounter++;
    }

    public void setGradeValue(byte gradeValue) {
        if(gradeValue > 0 && gradeValue <=10)
        {
            this.gradeValue = gradeValue;
        }
        else
            this.gradeValue = 0;
    }

    public void setStudent(Student student) {
        if(student != null)
        {
            this.student = student;
        }
        else
        {
            this.student = new Student();
        }
    }

    public void setCourse(Course course) {
        if (course != null) {
            this.course = course;
        } else {
            this.course = new Course();
        }
    }
    //3. konstruktori
    public Grade()
    {
        setCourse();
        setGradeValue();
        setStudent();
        setId();
    }
    public Grade(Course course, )
    {

    }

    //4. tostring funkcija

}
