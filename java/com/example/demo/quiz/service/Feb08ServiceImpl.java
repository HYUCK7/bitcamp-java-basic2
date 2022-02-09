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
        System.out.println("5. 구구단");
        for (int i = 2; i < 10; i +=4){
            for (int j = 1; j <= 9; j++){
                for (int k = i; k < i+4; k++){
                    System.out.print(k + "*" + j + "="+(k*j)+"\t");
                }
                System.out.print("\n");
            }
            System.out.println("\n");
        }
    }
}



