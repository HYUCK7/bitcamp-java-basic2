package com.example.demo.grade;

import java.util.Scanner;

/**
 * packageName: com.example.demo.grade
 * fileName   : GradeApp1
 * author     : HYUCK7
 * date       : 2022-01-26
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-01-26         HYUCK7         최초 생성
 */
public class GradeApp1 {
    static String GRADE_MARK = "성적표";
    String name;
    int kor;
    int eng;
    int math;

    public String getGrade1(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;

        int total = kor + eng + math;
        int avg = total / 3;
        String pass = (avg>=60)?"합격입니다.":"불합격입니다.";

        String res = String.format("" +
                "########## %s ########\n" +
                "이름: %s\n" +
                "> 국어: %d점 \n" +
                "> 영어: %d점 \n" +
                "> 수학: %d점\n" +
                "총점: %d점 \n" +
                "평균(정수): %d점\n" +
                "합격여부: %s\n" +
                "#######################",GRADE_MARK,name,kor,eng,math,total,avg,pass);
        return res;
    }
}
