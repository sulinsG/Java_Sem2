package models;

public class Student {
    //1. mainīgie
    private int id;
    private static int idCounter = 10000;
    private String name;
    private String surname;

    //2.1 get funckijas

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
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
    private void setId() {
        this.id = idCounter;
        idCounter++;
    }

    //3. konstruktori
    public Student()
    {
        setName("Test");
        setSurname("Mctesty");
        setId();
    }

    public Student(String name, String Surname)
    {
        setName(name);
        setSurname(Surname);
        setId();
    }

    //4. toString funkcija


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
