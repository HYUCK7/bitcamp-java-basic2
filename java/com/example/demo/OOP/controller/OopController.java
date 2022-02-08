package com.example.demo.OOP.controller;

import com.example.demo.OOP.service.PhoneService;
import com.example.demo.OOP.service.PhoneServiceImpl;

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
        PhoneService service = new PhoneServiceImpl();
        while(true){
            System.out.println("MENU : 0. 종료 1. 집전화  2. 휴대폰  3.  아이폰  4. 갤럭시 노트");
            switch(scanner.next()){
                case"0":
                    System.out.println("EXIT"); return;
                case"1":
                    service.usePhone(scanner);
                    break;
                case"2":
                    service.useCellPhone(scanner);
                    break;
                case"3" :
                    service.useIPhone(scanner);
                    break;
                case"4":
                    service.useGalPhone(scanner);
                    break;
            }
        }
    }
}
