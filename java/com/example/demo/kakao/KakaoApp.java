package com.example.demo.kakao;
/**
 * 전화번호와 메시지를 받아서 전송하는 어플을 만드시오.
 * String telNo, String message
 * */
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
