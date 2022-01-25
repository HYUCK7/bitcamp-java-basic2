package com.example.demo.kakao;
/**
 * packageName: com.example.kakao
 * fileName   : KakaoDemo.java
 * author     : HYUCK7
 * date       : 2022-01-24
 * desc       : 카카오앱을 실행하는 컨트롤러
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-01-24         HYUCK7        최초 생성
 */
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
