package models;

public class Student extends Person{
    //1. mainīgie
    private int id;
    private static int idCounter = 10000;


    //2.1 get funckijas

    public int getId() {
        return id;
    }



    private void setId() {
        this.id = idCounter;
        idCounter++;
    }

    //3. konstruktori
    public Student()
    {
        super();
        setId();
    }

    public Student(String name, String surname)
    {
        super(name,surname);
        setId();
    }

    //4. toString funkcija


    @Override
    public String toString() {
        return id + " " + super.getName() + " " + super.getSurname();
    }
}
