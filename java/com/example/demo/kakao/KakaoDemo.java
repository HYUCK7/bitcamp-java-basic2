package com.example.demo.kakao;

import java.util.Scanner;

public class KakaoDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KakaoApp kakaoApp = new KakaoApp();

        System.out.println(KakaoApp.WEB_PAGE);
        System.out.println("전화번호 : ");
        System.out.println("메시지 : ");

        String telNo = scanner.next();
        String message = scanner.next();

        String result = kakaoApp.kakao(telNo, message);
        System.out.println(result);
    }
}
