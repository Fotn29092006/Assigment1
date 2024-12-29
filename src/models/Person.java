package models;

public class Person {
    private String name;
    private String surname;
    private int age;
    private boolean gender;

    public Person(String name, String surname, int age, boolean gender) {
        setName(name);
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(boolean gender) {
        String genderString = gender ? "Male" : "Female";
        return "Hi, I am" + name + surname + ", a " + age + "-year-old " + genderString;
    }
}
