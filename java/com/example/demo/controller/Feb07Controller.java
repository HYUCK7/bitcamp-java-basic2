package com.example.demo.controller;

import com.example.demo.service.Feb07Service;
import com.example.demo.service.Feb07ServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : Feb07Controller
 * author     : HYUCK7
 * date       : 2022-02-07
 * desc       :1. 주사위 : dice
 *              2. 가위바위보: rps
 *              3. 입력 받은 두 수 사이의 있는 소수 구하기 : getPrime
 *              4. 자바로 입력받은 연도가 윤년, 평년: leapYear
 *              5. 임의로 입력 받은 숫자 맞추기 : numberGolf
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-02-07         HYUCK7         최초 생성
 */
public class Feb07Controller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Feb07Service service = new Feb07ServiceImpl();
        while(true){
            System.out.println("0. Exit  1. DICE  2. RPS  3. GetPrime  4. LeapYear  5. NumberGolf");
            switch (scanner.next()){
                case "0":
                    System.out.println("EXIT"); return;
                case "1":
                    service.DICE(scanner);
                    return;
                case"2":
                    service.RPS(scanner);
                    return;
                case"3":
                    service.GetPrime(scanner);
                    return;
                case"4":
                    service.LeapYear(scanner);
                    return;
                case"5":
                    service.NumberGolf(scanner);
                    return;
                default:
                    System.out.println("NO VALUE");

            }
        }
    }
}
