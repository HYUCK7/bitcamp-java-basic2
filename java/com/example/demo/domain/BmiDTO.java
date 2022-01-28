package com.example.demo.domain;

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
public class BmiDTO {
    double kg;
    double cm;
    public static String APP_NAME = "BMI.App";

    public double getKg(){
        return kg;
    }
    public void setKg(double kg){
        this.kg = kg;
    }
    public double getCm() {
        return cm;
    }
    public void setCm(double cm) {
        this.cm = cm;
    }
}
