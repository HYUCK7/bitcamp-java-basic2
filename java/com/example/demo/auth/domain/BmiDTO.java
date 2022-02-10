package com.example.demo.auth.domain;

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
public class BmiDTO extends Object {
    private final static BmiDTO bmiDTO =new BmiDTO();
    private BmiDTO(){}
    public static BmiDTO getInstance(){return bmiDTO;}

    double weight;
    double tall;
    public static String APP_NAME = "BMI.App";

    public double getWeight() {
        return weight;
    }

    public double getTall() {
        return tall;
    }

    public void setTall(double tall) {
        this.tall = tall;
    }

    public void setWeight(double weight) {
        this.weight = weight;

    }
}

