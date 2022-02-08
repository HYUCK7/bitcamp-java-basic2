package com.example.demo.quiz.controller;

import com.example.demo.quiz.service.*;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : ArrayExam
 * author     : HYUCK7
 * date       : 2022-02-04
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-02-04         HYUCK7         최초 생성
 */
public class QuizController {
    public void execute (Scanner scanner) {
        Feb06Service feb06Service = new Feb06ServiceImpl();
        Feb07Service feb07Service = new Feb07ServiceImpl();
        Feb08Service feb08Service = new Feb08ServiceImpl();
       while (true){
           System.out.println("[Sub Menu] 0.EXIT 1. 2월 6일 2. 2월 7일 3. 2월 8일");
           switch (scanner.next()){
               case "0":
               System.out.println("### EXIT ###"); return;
               case "1":
                   String[] arr = {"강 민", "최건일", "유재혁", "김아름", "장원종",
                           "DP", "BIN", "HASH", "STACK", "Brute Force",
                           "Graph", "Greedy", "sort", "Heap", "DFS",
                           "Queue", "BFS"};
                   System.out.println("[소메뉴]\n 0.Exit \n1.팀별 과제 \n2.팀장이 맡은 과제 \n3.큐를 담당한 사람\n 4. 큐를 담당한 사람 (다른 버전) \n5.팀원별 과제 수");
                   switch (scanner.next()) {
                       case "0":
                           System.out.println("EXIT");
                           return;
                       case "1":
                           feb06Service.quiz1(arr);
                           break;
                       case "2":
                           feb06Service.quiz2(arr);
                           break;
                       case "3":
                           feb06Service.quiz3(arr);
                           break;
                       case "4":
                           feb06Service.quiz4(arr);
                           break;
                       case "5":
                           feb06Service.quiz5(arr);
                   }
                   break;
               case "2":
                   System.out.println("[소메뉴]\n 0.Exit \n1.주사위 \n2.가위바위보 \n3.소수 구하기\n 4.윤년/평년\n 5.임의숫자 맞추기");
                   switch (scanner.next()){
                       case "0":
                           System.out.println("EXIT"); return;
                       case "1":
                           feb07Service.DICE(scanner);
                           break;
                       case"2":
                           feb07Service.RPS(scanner);
                           break;
                       case"3":
                           feb07Service.GetPrime(scanner);
                           break;
                       case"4":
                           feb07Service.LeapYear(scanner);
                           break;
                       case"5":
                           feb07Service.NumberGolf(scanner);
                           break;
                       default:
                           System.out.println("NO VALUE");
                   } break;
               case "3":
                   System.out.println("[소메뉴]\n 0.Exit \n1.주사위 \n2.가위바위보 \n3.소수 구하기\n 4.윤년/평년\n 5.임의숫자 맞추기");
                   switch (scanner.next()){
                       case "0":
                           System.out.println("EXIT"); return;
                       case "1":
                           feb08Service.lotto(scanner);
                           break;
                       case"2":
                           feb08Service.baseball(scanner);
                           break;
                       case"3":
                           feb08Service.booking(scanner);
                           break;
                       case"4":
                           feb08Service.bank(scanner);
                           break;
                       case"5":
                           feb08Service.gugudan(scanner);
                           break;
                       default:
                           System.out.println("NO VALUE");
                   }break;
           }
       }
    }
}






