package com.example.demo.bmi;

/**
 * packageName: com.example.demo.bmi
 * fileName   : BmiApp1
 * author     : HYUCK7
 * date       : 2022-01-25
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-01-25         HYUCK7         최초 생성
 */
public class BmiApp1 {
    private int kg;
    private int cm;
    public static String APP_NAME = "BMI.APP";

    public String bmi(int kg, int cm){
        this.kg = kg;
        this.cm = cm;
        String res = String.format("키는 %d, 몸무게는 %d 이므로 정상입니다.",this.cm, this.kg);
        return res;
    }
}
