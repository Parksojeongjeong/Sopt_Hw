package org.sopt.model.builder;

import org.sopt.model.Department;

public class DepartmentBuilder {
    private int number; //학과 고유 번호
    private String name; //학과 이름
    private int pnumber; //학과 전화번호
    private String type; //학과 타입

    public DepartmentBuilder setNumber(final int number){
        this.number=number;
        return this;
    }
    public DepartmentBuilder setName(final String name){
        this.name=name;
        return this;
    }

    public DepartmentBuilder setPnumber(int pnumber) {
        this.pnumber = pnumber;
        return this;
    }

    public DepartmentBuilder setType(String type) {
        this.type = type;
        return this;
    }
    public Department build(){
        return new Department(this.number, this.name, this.pnumber, this.type);
    }
}
