package com.example.demo.quiz.service;

import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.service
 * fileName   : Feb08ServiceImpl
 * author     : HYUCK7
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-02-08         HYUCK7         최초 생성
 */
public class Feb08ServiceImpl implements Feb08Service {

    @Override
    public void lotto(Scanner scanner) {

    }

    @Override
    public void baseball(Scanner scanner) {

    }

    @Override
    public void booking(Scanner scanner) {

    }

    @Override
    public void bank(Scanner scanner) {

    }

    @Override
    public void gugudan(Scanner scanner) {
        System.out.println("5. 구구단" + "\n" + "   *** 몇 단을 출력할까요 ***    ");
        String result = "";
        int i = scanner.nextInt();
        System.out.println("    ###    " + i + "단    ###    ");
        for (int j = 1; j < 10; j++) {
            result = String.format("%d x %d = %d", i, j, (i * j));
            System.out.print(result + "\t");
        }
    }
}
