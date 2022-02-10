package com.example.demo.oop.controller;

import com.example.demo.oop.domain.CellPhone;
import com.example.demo.oop.domain.GalPhone;
import com.example.demo.oop.domain.IPhone;
import com.example.demo.oop.domain.Phone;
import com.example.demo.oop.service.PhoneService;
import com.example.demo.oop.service.PhoneServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : PhoneController
 * author     : HYUCK7
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-02-08         HYUCK7         최초 생성
 */
public class OopController {
    public void execute(Scanner scanner) {
        while(true){
            System.out.println("MENU : 0. 종료 \n  " +
                    "1. 은닉화(Encapsulation) \n" +
                    "2. 상속(Inheritance) \n " +
                    "3. 추상화(Abstraction) \n" +
                    "4. 다형성 Polymorphism");
            switch(scanner.next()){
                case"0":
                    System.out.println("EXIT"); return;
                case"1":
                    System.out.println("POJO가 은닉화다.");
                    break;
                case"2":
                    System.out.println("extends가 상속이다.");
                    Phone phone = new Phone("금성전화기","금성전자");
                    IPhone iPhone = new IPhone("애플");
                    CellPhone cellPhone = new CellPhone("핸드폰", "블랙베리", "이동중에");
                    GalPhone galPhone = new GalPhone("삼성");
                    PhoneService service = new PhoneServiceImpl();
                    switch (scanner.next()){
                        case "0":
                            System.out.println("EXIT"); return;
                        case "1":
                            System.out.println(" ### 집전화 ###");
                            phone.setCall("여보세요 ### 입니다.");
                            service.usePhone(phone);
                            break;
                        case "2":
                            System.out.println("Abstraction은 추상화다.");
                            System.out.println(" ### 휴대폰 ###");
                            cellPhone.setCall("여보세요");
                            service.useCellPhone(cellPhone);
                            break;
                        case "3":
                            System.out.println(" ### 아이폰 ###");
                            iPhone.setMove("이동하며");
                            iPhone.setSearch("검색");
                            service.useIPhone(iPhone);
                            break;
                        case "4":
                            System.out.println(" ### 갤럭시 ###");
                            galPhone.setPay("삼성페이");
                            service.useGalPhone(galPhone);
                            break;
                    }
            }
        }
    }
}
