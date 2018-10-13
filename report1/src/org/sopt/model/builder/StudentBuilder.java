package org.sopt.model.builder;

import org.sopt.model.Student;

public class StudentBuilder {
    private int number;
    private String name;
    private int grade;
    private String depart;
    private String email;
    private String address;
    private int age;
    private String state;

    public StudentBuilder setNumber(final int number){
        this.number=number;
        return this;
    }
    public StudentBuilder setName(final String name){
        this.name=name;
        return this;
    }
    public StudentBuilder setGrade(final int grade){
        this.grade=grade;
        return this;
    }

    public StudentBuilder setDepart(String depart) {
        this.depart = depart;
        return this;
    }

    public StudentBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public StudentBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setState(String state) {
        this.state = state;
        return this;
    }

    public Student build(){
        return new Student(this.number, this.name, this.grade, this.depart, this.email, this.address, this. age, this.state);
    }
}
