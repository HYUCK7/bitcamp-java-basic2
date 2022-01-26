package com.example.demo.bmi;

import java.util.Scanner;

/**
 * packageName: com.example.demo.bmi
 * fileName   : BmiDemo1
 * author     : HYUCK7
 * date       : 2022-01-25
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-01-25         HYUCK7         최초 생성
 */
public class BmiDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BmiApp1 bmiApp1 = new BmiApp1();
        System.out.println(BmiApp1.APP_NAME);
        System.out.println("몸무게(kg): ");
        double kg = scanner.nextDouble();
        System.out.println("키(m): ");
        double cm = scanner.nextDouble();

        String res = bmiApp1.bmi(kg,cm);
        System.out.println(res);
    }
}
