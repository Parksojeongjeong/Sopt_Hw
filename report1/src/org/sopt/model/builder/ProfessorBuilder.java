package org.sopt.model.builder;

import org.sopt.model.Professor;

public class ProfessorBuilder {
    private int number; //교수 고유 번호
    private String name; //교수 이름
    private String prodepart; //교수 학과
    private int pnumber; //교수 전화번호
    private String subject; //담당과목

    public ProfessorBuilder setNumber(final int number){
        this.number=number;
        return this;
    }
    public ProfessorBuilder setName(final String name){
        this.name=name;
        return this;
    }
    public ProfessorBuilder setProdepart(final String prodepart){
        this.prodepart=prodepart;
        return this;
    }
    public ProfessorBuilder setPnumber(final int pnumber){
        this.pnumber=pnumber;
        return this;
    }
    public ProfessorBuilder setSubject(final String subject){
        this.subject=subject;
        return this;
    }
    public Professor build(){
        return new Professor(this.number,this.name, this.prodepart, this.pnumber, this.subject);
    }
}
