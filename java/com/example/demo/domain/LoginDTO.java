package com.example.demo.domain;
/**
 * packageName: com.example.login
 * fileName   : LoginApp.java
 * author     : HYUCK7
 * date       : 2022-01-24
 * desc       : 아이디와 비밀번호, 이름을 입력하면 로그인 하는 앱
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-01-24       HYUCK7        최초 생성
 * 2022-01-26       HYUCK7        if절 추가
 */
public class LoginDTO {
        private String ID;
        private String PW ;
        private String name;
        public static String PASSWORD = "abc";
        public static String LOGIN_APP = "     <<<LOGIN APP>>>        ";

        public String getID(){
                return ID;
        }
        public void setID(String ID){
                this.ID = ID;
        }
        public String getPW(){
                return PW;
        }
        public void setPW(String PW){
                this.PW = PW;
        }
        public String getName(){
                return name;
        }
        public void setName(String name){
                this.name = name;
        }

}
