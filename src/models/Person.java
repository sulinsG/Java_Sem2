package models;


public class Person {
    private String name;
    private String surname;


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

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

    public Person()
    {
        setName("Test");
        setSurname("Mctesty");
    }
    public Person (String name, String surname)
    {
        setName(name);
        setSurname(surname);
    }

    @Override
    public String toString() {
        return  name + " " + surname;
    }
}
