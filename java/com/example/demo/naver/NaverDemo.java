package com.example.demo.naver;

import java.util.Scanner;

/**
 * packageName: com.example.demo.naver
 * fileName   : NaverDemo
 * author     : HYUCK7
 * date       : 2022-01-25
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-01-25         HYUCK7         최초 생성
 */
public class NaverDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NaverApp naverApp = new NaverApp();
        System.out.println("아이디: ");
        String ID = scanner.next();
        System.out.println("패스워드: ");
        String PW = scanner.next();

        String result = naverApp.naver(ID, PW);
        System.out.println(result);
    }
}
