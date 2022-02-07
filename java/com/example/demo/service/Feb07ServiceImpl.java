package com.example.demo.service;

import java.util.Scanner;

/**
 * packageName: com.example.demo.service
 * fileName   : Feb07ServiceImpl
 * author     : HYUCK7
 * date       : 2022-02-07
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-02-07         HYUCK7         최초 생성
 */
public class Feb07ServiceImpl implements Feb07Service{
    @Override
    public void DICE(Scanner scanner) {
        String res = " ";
        int start = 0;
        int dice1 = (int) (Math.random() * 6 + 1);
        int dice2 = (int) (Math.random() * 6 + 1);

        System.out.println("숫자 0을 입력하면 게임이 시작합니다.");
        if(start == scanner.nextInt()) {
            System.out.println("사용자가 주사위를 던집니다.");
            System.out.println(dice1);
            System.out.println("컴퓨터가 주사위를 던집니다.");
            System.out.println(dice2);}

            if(dice1>dice2) {
                res = "사용자가 이겼습니다.";
            }else if(dice1 == dice2){
                res = "비겼습니다.";
            } else res = "컴퓨터가 이겼습니다.";
        System.out.println(res);
    }

    @Override
    public void RPS(Scanner scanner) {

    }

    @Override
    public void GetPrime(Scanner scanner) {

    }

    @Override
    public void LeapYear(Scanner scanner) {

    }

    @Override
    public void NumberGolf(Scanner scanner) {

    }
}
