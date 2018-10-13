package org.sopt.model;

public class Student {
    private int number;
    private String name;
    private int grade;
    private String depart;
    private String email;
    private String address;
    private int age;
    private String state;

    public Student(int number, String name, int grade, String depart, String email, String address, int age, String state) {
        this.number = number;
        this.name = name;
        this.grade = grade;
        this.depart = depart;
        this.email = email;
        this.address = address;
        this.age = age;
        this.state = state;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public String getDepart() {
        return depart;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public String getState() {
        return state;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", depart='" + depart + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", state='" + state + '\'' +
                '}';
    }
}
