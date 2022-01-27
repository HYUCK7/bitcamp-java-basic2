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
    public String execute(double kg, double cm) {
        BmiApp1 bmiApp1 = new BmiApp1();
        return bmiApp1.bmi(kg,cm);

    }
}
