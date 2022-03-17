
package models;

import org.w3c.dom.ls.LSOutput;

public class Professor extends Person {
    //1. mainigie
    private ProfDegree degree;
    private int id;
    private static int idCounter = 0;

    //2.1 get funkcijas
    public ProfDegree getDegree() {
        return degree;
    }
    public int getId() {
        return id;
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
        super();    // Person() klases bezargumenta konstruktors
        setId();
        setDegree(ProfDegree.doctor);
    }

    //Professor prof1 = new Professor("Gatis", "Sulins", ProfDegree.bachelors);
    public Professor(String name, String surname, ProfDegree degree)
    {//veic gan validaciju, gan saglabasanu
        super(name,surname);
        setId();
        setDegree(degree);
    }

    @Override
    public String toString() {
        return id + " " + super.getName() + " " + super.getSurname() + " " + degree;
    }


}
