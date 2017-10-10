package data;

public class Person {

    private String name;
    private int age;
    private String personID;

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public Person(String personID, String name, int age ) {
        this.name = name;
        this.age = age;
        this.personID = personID;
    }
    
    public Person (){
    
}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return personID + ", " + name + ", " + age;
    }
    
    
    
    
}
