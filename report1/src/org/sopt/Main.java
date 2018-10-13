package org.sopt;

import org.sopt.model.Student;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        //제네릭을 사용해 학생 타입 ArrayList 생성
        final ArrayList<Student> studentList = new ArrayList<>();

        //세개의 학생 객체 생성
        final Student student1 = new Student(201732014,"박소정",2,"software","rty5262@naver.com","인천 청라",21,"재학 중");
        final Student student2 = new Student(201532022,"송지은",3,"software","ji_eun@naver.com","시흥",23,"재학 중");
        final Student student3 = new Student(201732038,"허수진",2,"software","her0807@naver.com","오류동",21,"재학 중");

        //ArrayList에 객체 add
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        //ArrayList를 돌면서 각 객체의 toString 메소드 실행
        for(final Student s : studentList){
            System.out.println(s.toString());
        }


    }
}
