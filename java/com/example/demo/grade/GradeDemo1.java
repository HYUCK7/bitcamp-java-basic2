package com.example.demo.grade;

import java.util.Scanner;

/**
 * packageName: com.example.demo.grade
 * fileName   : GradeDemo1
 * author     : HYUCK7
 * date       : 2022-01-26
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-01-26         HYUCK7         최초 생성
 */
public class GradeDemo1 {
    public static void main(String[] args) {
        GradeApp1 gradeApp1 = new GradeApp1();
        Scanner scanner = new Scanner(System.in);
        for(int i=1; i<3; i++) {
            System.out.println(i + "번 학생이름: ");
            String name = scanner.next();
            System.out.println("국어 점수: ");
            int kor = scanner.nextInt();
            System.out.println("영어 점수: ");
            int eng = scanner.nextInt();
            System.out.println("수학 점수: ");
            int math = scanner.nextInt();

            String res = gradeApp1.getGrade1(name, kor, eng, math);
            System.out.println(res);
        }
    }
}
