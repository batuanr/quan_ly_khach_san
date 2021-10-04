package model;

public class Person {
    private String name;
    private int age;
    private String CMND;


    public Person(String name, int age, String CMND) {
        this.name = name;
        this.age = age;
        this.CMND = CMND;

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

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age +
                ", CMND='" + CMND + '\'' +
                '}';
    }
}