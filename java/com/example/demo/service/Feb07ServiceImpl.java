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
        int num = (int)(Math.random() * 6 +1);
        if(num==1){
            res = "1번이 나왔습니다.";
        }else if(num==2){
            res = "2번이 나왔습니다.";
        }else if(num==3){
            res = "3번이 나왔습니다.";
        }else if(num==4){
            res = "4번이 나왔습니다.";
        }else if(num==5){
            res = "5번이 나왔습니다.";
        }if(num==6){
            res = "6번이 나왔습니다.";
        }
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
