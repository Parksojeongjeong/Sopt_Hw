package org.sopt.model.builder;

import org.sopt.model.University;

public class UniversityBuilder {
    private int number;
    private String name;
    private int pnumber;
    private String address;

    public UniversityBuilder setNumber(int number) {
        this.number = number;
        return this;
    }

    public UniversityBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public UniversityBuilder setPnumber(int pnumber) {
        this.pnumber = pnumber;
        return this;
    }

    public UniversityBuilder setAddress(String address) {
        this.address = address;
        return this;
    }
    public University build(){
        return new University(this.number, this.name, this.pnumber, this.address);
    }
}
