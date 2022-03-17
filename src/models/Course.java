package models;


import java.util.Objects;

public class Course {
    //1. mainīgie
    private int id;
    private static int idCounter = 1000;
    private String title;
    private int creditPoints;
    private Professor professor;

    //2.1. get funkcijas


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getCreditPoints() {
        return creditPoints;
    }

    public Professor getProfessor() {
        return professor;
    }

    //2.2 set funkcijas
    private void setId()
    {
        this.id = idCounter++;
    }
    public void setTitle(String title) {
        if(title != null && !title.isEmpty() && title.matches("[A-ZĀĒŪĪĻĶĢŠŽČŅ]{1}[\\s\\d a-zēūīāšģķļņčžA-ZĀĒŪĪĻĶĢŠŽČŅ]+"))
        {
            this.title = title;
        }
        else
            this.title = "unknown";
    }

    public void setCreditPoints(int creditPoints) {
        if(creditPoints > 0 && creditPoints <= 20)
        {
            this.creditPoints = creditPoints;
        }
        else
        {
            this.creditPoints = 2;
        }
    }

    public void setProfessor(Professor professor) {
        if (professor != null) {
            this.professor = professor;
        } else {
            this.professor = new Professor();
        }
    }

    //3. konstruktori
    public Course()
    {
       setId();
       setTitle("Testa kurss");
       setCreditPoints(2);
       setProfessor(new Professor());
    }
    public Course(String title, int creditPoints, Professor professor)
    {
        setId();
        setTitle(title);
        setCreditPoints(creditPoints);
        setProfessor(professor);
    }




    //4. toString funkcija

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", creditPoints=" + creditPoints +
                ", professor=" + professor +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        Course otherCourse = (Course)o;
        if(title.equals(otherCourse.getTitle()) && title.equals(otherCourse.getCreditPoints()))
        {
            return true;
        }
        else
            return false;
    }

}
