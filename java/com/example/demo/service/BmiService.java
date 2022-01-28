package com.example.demo.service;

import com.example.demo.domain.BmiDTO;

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
public class BmiService {
    public String getBMI(BmiDTO bmi) {

            double res = bmi.getKg() / bmi.getCm() * bmi.getCm();
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
                    bmi.getKg(), bmi.getCm(), res);
        }
    }

