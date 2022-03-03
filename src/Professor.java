
package models;

import org.w3c.dom.ls.LSOutput;

public class Professor {
    //1. mainigie
    private String name;
    private String surname;
    private ProfDegree degree;
    private static long p_ID;

    //2. get un set funkcijas
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public ProfDegree getDegree() {
        return degree;
    }

    public void setDegree(ProfDegree degree) {
        this.degree = degree;
    }

    public static long getP_ID() {
        return p_ID;
    }

    public static void setP_ID(long p_ID) {
        Professor.p_ID = p_ID;
    }

}
