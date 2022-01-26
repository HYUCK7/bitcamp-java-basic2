package com.example.demo.grade;

/**
 * packageName: com.example.demo.grade
 * fileName   : GradeApp
 * author     : HYUCK7
 * date       : 2022-01-26
 * desc       :
 *
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-01-26         HYUCK7         최초 생성
 */
public class GradeApp {
    static String GRADE_TITLE = "성적표";
    private String name;
    private int kor;
    private int eng;
    private int math;

    public String getGrade(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        int total = 0;
        int avg = 0;
        String pass = (avg>=60) ? "합격" : "불합격";


        String grade = String.format(
                " * ########## %s ########\n" +
                " * 이름: %s\n" +
                " * > 국어: %d점\n" +
                " * > 영어: %d점\n" +
                " * > 수학: %d점\n" +
                " * 총점: %d점\n" +
                " * 평균(정수): %d점\n" +
                " * 합격여부: %s\n" +
                " * #######################", GRADE_TITLE, name, kor, eng, math, total,avg,pass);
        return grade;
    }
}
