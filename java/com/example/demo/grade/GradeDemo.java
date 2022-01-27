package com.example.demo.grade;

import java.util.Scanner;

/**
 * packageName: com.example.demo.grade
 * fileName   : GradeDemo
 * author     : HYUCK7
 * date       : 2022-01-26
 * desc       :
 *
 * 사용자로부터
 * 이름 [          ]
 * 국어 [          ]
 * 영어 [          ]
 * 수학 [          ]
 * 을 차례대로 입력 받아서
 " * ########## %s ########\n" +
 " * 이름: %s\n" +
 " * > 국어: %d점\n" +
 " * > 영어: %d점\n" +
 " * > 수학: %d점\n" +
 " * 총점: %d점\n" +
 " * 평균(정수): %d점\n" +
 " * 합격여부: %s\n" +
 " * #######################"
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-01-26         HYUCK7         최초 생성
 */
public class GradeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeApp gradeApp = new GradeApp();

        String name = scanner.next();
        int kor = scanner.nextInt();
        int eng = scanner.nextInt();
        int math = scanner.nextInt();

        String grade = gradeApp.getGrade(name, kor, eng, math);
        System.out.println(grade);

    }
}
