package practice08;

public class Person {
    private int id;
    private String name;
    private int age;

    public String introduce(){
        return ("My name is " + name + ". I am " + age + " years old.");
    }
    public Person(int id,String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public boolean equals(Object object) {
        Person person = (Person) object;
        return id == person.getId();
    }

}