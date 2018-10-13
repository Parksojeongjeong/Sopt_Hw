package org.sopt.model;

public class University {
    private int number;
    private String name;
    private int pnumber;
    private String address;

    public University(int number, String name, int pnumber, String address) {
        this.number = number;
        this.name = name;
        this.pnumber = pnumber;
        this.address = address;
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

    public String getAddress() {
        return address;
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

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "University{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", pnumber=" + pnumber +
                ", address='" + address + '\'' +
                '}';
    }
}
