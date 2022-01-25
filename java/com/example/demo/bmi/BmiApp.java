package com.example.demo.bmi;

/**
 * packageName: com.example.demo.bmi
 * fileName   : BmiApp
 * author     : HYUCK7
 * date       : 2022-01-25
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-01-25         HYUCK7         최초 생성
 */
public class BmiApp {
    private int kg;
    private int cm;

    static String APP_NAME = "BMI.App";

    public String bmi (int kg, int cm) {
        this.kg = kg;
        this.cm = cm;

        String res = String.format("몸무게는 %f, 키는 %f, BMI 지수 정상 입니다.",
                this.kg, this.cm);
        return res;
    }
}