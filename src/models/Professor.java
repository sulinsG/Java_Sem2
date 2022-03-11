
package models;

import org.w3c.dom.ls.LSOutput;

public class Professor {
    //1. mainigie
    private String name;
    private String surname;
    private ProfDegree degree;
    private static long p_ID;

    //2. get funkcijas
    public ProfDegree getDegree() {
        return degree;
    }
    public String getSurname() {
        return surname;
    }
    public static long getP_ID() {
        return p_ID;
    }

    //3. set funkcijas
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
    public static void setP_ID(long p_ID) {
        Professor.p_ID = p_ID;
    }


}
