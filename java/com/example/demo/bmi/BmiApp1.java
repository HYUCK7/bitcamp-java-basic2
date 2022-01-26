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
    double kg;
    double cm;
    static String APP_NAME = "BMI.App";

    public String bmi(double kg, double cm) {
        this.kg = kg;
        this.cm = cm;
        double res = kg / (cm*cm);
        if(res <=18.5){
            System.out.println("저체중입니다.");
        }else if(res<=23) {
            System.out.println("정상입니다.");
        }else if(res<=25){
            System.out.println("과체중입니다.");
        }else if(res<=30) {
            System.out.println("비만입니다.");
        }else if(30<res){
            System.out.println("고도비만입니다.");}

            return String.format("몸무게는 %f, 키는 %f로, BMI 지수는 %f ",
                    this.kg, this.cm, res);
    }
}
