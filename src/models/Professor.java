
package models;

import org.w3c.dom.ls.LSOutput;

public class Professor {
    //1. mainigie
    private String name;
    private String surname;
    private ProfDegree degree;

    private int id;
    private static int idCounter = 0;

    //2.1 get funkcijas
    public ProfDegree getDegree() {
        return degree;
    }
    public String getSurname() {
        return surname;
    }
    public int getId() {
        return id;
    }


    //2.2 set funkcijas
    public void setName(String name) {
        if(name != null && name.matches("[A-ZĀĒŪĪĻĶĢŠŽČŅ]{1}[a-zēūīāšģķļņčž]+"))//\p{L}+
        {
            this.name = name;
        }
        else
            this.name = "notknown";
        }
    public void setSurname(String surname) {
        if(surname != null && surname.matches("[A-ZĀĒŪĪĻĶĢŠŽČŅ]{1}[a-zēūīāšģķļņčž]+"))//\p{L}+
        {
            this.surname = surname;
        }
        else
            this.surname = "notknown";
    }


    public void setDegree(ProfDegree degree) {
       if(degree != null)
       {
           this.degree = degree;
       }
        else
            this.degree = ProfDegree.master;
    }


    private void setId() {
        this.id = idCounter;
        idCounter++;
    }

    //3.konstruktori
    public Professor()
    {
        setName("Test");
        setSurname("Professor");
        setDegree(ProfDegree.doctor);
    }

    //Professor prof1 = new Professor("Gatis", "Sulins", ProfDegree.bachelors);
    public Professor(String name, String surname, ProfDegree degree)
    {//veic gan validaciju, gan saglabasanu
        setName(name);
        setSurname(surname);
        setDegree(degree);
    }

    //4.toString
    public String toString()
    {
        return name + " " + surname + " " + degree;
    }






}
