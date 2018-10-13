package org.sopt.model;

public class Professor {
    private int number; //교수 고유 번호
    private String name; //교수 이름
    private String prodepart; //교수 학과
    private int pnumber; //교수 전화번호
    private String subject; //담당과목

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getProdepart() {
        return prodepart;
    }

    public int getPnumber() {
        return pnumber;
    }

    public String getSubject() {
        return subject;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProdepart(String prodepart) {
        this.prodepart = prodepart;
    }

    public void setPnumber(int pnumber) {
        this.pnumber = pnumber;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", prodepart='" + prodepart + '\'' +
                ", pnumber=" + pnumber +
                ", subject='" + subject + '\'' +
                '}';
    }

    public Professor(final int number, final String name, final String prodepart, final int pnumber, final String subject){
        this.number = number;
        this.name=name;
        this.prodepart=prodepart;
        this.pnumber=pnumber;
        this.subject=subject;
    }
}
