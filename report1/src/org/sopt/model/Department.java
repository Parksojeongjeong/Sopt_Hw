package org.sopt.model;

public class Department {

    private int number; //학과 고유 번호
    private String name; //학과 이름
    private int pnumber; //학과 전화번호
    private String type; //학과 타입

    public Department(int number, String name, int pnumber, String type) {
        this.number = number;
        this.name = name;
        this.pnumber = pnumber;
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getPnumber() {
        return pnumber;
    }

    public String getType() {
        return type;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPnumber(int pnumber) {
        this.pnumber = pnumber;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Department{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", pnumber=" + pnumber +
                ", type='" + type + '\'' +
                '}';
    }
}
