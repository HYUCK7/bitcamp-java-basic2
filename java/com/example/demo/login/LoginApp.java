package com.example.demo.login;

public class LoginApp {
        private String ID;
        private String PW;
        private String name;
        static String LOGIN_APP = "     <<<LOGIN APP>>>        ";

                public String login(String ID, String PW, String name) {
                        this. ID = ID;
                        this. PW = PW;
                        this. name = name;

                        return String.format("Hello, ID: %s, PW: %s, name: %s" ,
                        this.ID, this.PW, this.name);
                }
}
