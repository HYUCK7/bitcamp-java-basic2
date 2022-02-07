package com.example.demo.service;

import com.example.demo.domain.*;

/**
 * packageName: com.example.demo.service
 * fileName   : StudentServiceImpl
 * author     : HYUCK7
 * date       : 2022-02-07
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-02-07         HYUCK7         최초 생성
 */
public class StudentServiceImpl implements StudentSevice{
    /***
     * BMI = w/ (t*t)
     *고도 비만 : 35 이상
     * 중(重)도 비만 (2단계 비만) : 30 - 34.9
     * 경도 비만 (1단계 비만) : 25 - 29.9
     * 과체중 : 23 - 24.9
     * 정상 : 18.5 - 22.9
     * 저체중 : 18.5 미만
     */
    @Override
    public String getBmi(BmiDTO bmi) {
        double res = bmi.getWeight() / bmi.getTall() * bmi.getTall();
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
                bmi.getWeight(), bmi.getTall(), res);

    }

    @Override
    public String calc(CalcDTO calc) {
        int res = 0;
        switch(calc.getOpcode()){
            case "+": res = calc.getNum1() + calc.getNum2(); break;
            case "-": res = calc.getNum1() - calc.getNum2(); break;
            case "*": res = calc.getNum1() * calc.getNum2(); break;
            case "/": res = calc.getNum1() / calc.getNum2(); break;
        }
        return String.format( "%d %s %d = %d", calc.getNum1(), calc.getOpcode(), calc.getNum2(), res );
    }

    @Override
    public String search(GoogleDTO google) {
        return String.format("검색 결과 : %s", google.getUrl());
    }

    @Override
    public String getGrade(GradeDTO grade) {
        int total = grade.getKor() + grade.getEng() + grade.getMath();
        int avg = total / 3;
        String pass = (avg>=60)?"합격입니다.":"불합격입니다.";

        return String.format("" +
                "########## %s ########\n" +
                "이름: %s\n" +
                "> 국어: %d점 \n" +
                "> 영어: %d점 \n" +
                "> 수학: %d점\n" +
                "총점: %d점 \n" +
                "평균(정수): %d점\n" +
                "합격여부: %s\n" +
                "#######################",GradeDTO.GRADE_MARK,grade.getName(),grade.getKor(),grade.getEng(),grade.getMath(),total,avg,pass);
    }

    @Override
    public String hello(HelloDTO hello) {
        return String.format("내 이름은 %s, 나이는 %d살이야." ,
                hello.getName(), hello.getAge());
    }

    @Override
    public String login(LoginDTO login) {
        String res ="";
        return res = (login.getPW().equals(LoginDTO.PASSWORD))?
                String.format(" %s 님의 비밀번호 %s가 맞습니다. 로그인 성공 "
                        , login.getName(), login.getPW())
                : String.format(" %s 님의 ID는 맞으나, PW %s 가 틀립니다. 로그인 실패 "
                , login.getName(),login.getPW());
    }
}
