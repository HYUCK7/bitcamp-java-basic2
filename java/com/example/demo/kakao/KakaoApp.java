package com.example.demo.kakao;
/**
 * packageName: com.example.kakao
 * fileName   : KakaoApp.java
 * author     : HYUCK7
 * date       : 2022-01-24
 * desc       : 전화번호와 보낼 메시지를 입력하면 나타나는 앱
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-01-24         HYUCK7        최초 생성
 */
public class KakaoApp {
        String telNo;
        String message;

        static String WEB_PAGE = "    <<<KAKAO>>>    ";

        public String kakao(String telNo, String message) {
            this.telNo = telNo;
            this.message = message;

            return String.format("전화번호는 %s, 보낼 메시지는 %s 입니다.",
                    this.telNo,this.message);
        }
}
