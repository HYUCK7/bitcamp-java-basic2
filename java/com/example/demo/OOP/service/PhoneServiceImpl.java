package com.example.demo.OOP.service;

import java.util.Scanner;

/**
 * packageName: com.example.demo.service
 * fileName   : PhoneServiceImpl
 * author     : HYUCK7
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-02-08         HYUCK7         최초 생성
 */
public class PhoneServiceImpl implements PhoneService {

    @Override
    public void usePhone(Scanner scanner) {
        System.out.println("집전화");
    }

    @Override
    public void useCellPhone(Scanner scanner) {
        System.out.println("휴대폰");
    }

    @Override
    public void useIPhone(Scanner scanner) {
        System.out.println("아이폰");
    }

    @Override
    public void useGalPhone(Scanner scanner) {
        System.out.println("갤럭시노트");
    }
}