package first;


public class Person {
    private String name;
    private String surname;
    private String idNumber;
    private int birthYear;

    public Person(){

    }

    public Person (String name, String surname, String idNumber, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.idNumber = idNumber;
        this.birthYear = birthYear;
    }

    @Override 
    public String toString(){
        return "Person{" + "name='" + name + '\''+ ", surname='" + surname +
        '\'' + ", idNumber='" + idNumber + '\'' + ", birthYear='" + birthYear + '}';
    }

}

