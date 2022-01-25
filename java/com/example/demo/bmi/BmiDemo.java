package com.example.demo.bmi;

import java.util.Scanner;

/**
 * packageName: com.example.demo.bmi
 * fileName   : BmiDemo
 * author     : HYUCK7
 * date       : 2022-01-25
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-01-25         HYUCK7         최초 생성
 */
public class BmiDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BmiApp bmiApp = new BmiApp();
        System.out.println(BmiApp.APP_NAME);
        System.out.println("몸무게: ");
        int kg = scanner.nextInt();
        System.out.println("키는: ");
        int cm = scanner.nextInt();

        String result = bmiApp.bmi(kg, cm);
        System.out.println(result);

    }
}
