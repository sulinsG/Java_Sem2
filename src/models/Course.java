package models;


public class Course {
    //1. mainīgie
    private int id;
    private static int idCounter = 1000;
    private String title;
    private byte creditPoints;
    private Professor professor;

    //2.1. get funkcijas


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public byte getCreditPoints() {
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
        if(title != null && title.isEmpty() && title.matches("[A-ZĀĒŪĪĻĶĢŠŽČŅ]{1}[\\s\\d a-zēūīāšģķļņčžA-ZĀĒŪĪĻĶĢŠŽČŅ]+"))
        {
            this.title = title;
        }
        else
            this.title = "unknown";
    }

    public void setCreditPoints(byte creditPoints) {
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
        if (professor != null &&)
        {
            this.professor = professor;
        }
        else
        {
            this.professor = new Professor();
        }


    //3. konstruktori


    //4. toString funkcija
}
