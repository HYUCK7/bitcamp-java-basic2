package com.example.demo.quiz.controller;

import com.example.demo.quiz.service.QuizService;
import com.example.demo.quiz.service.QuizServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.controller
 * fileName   : Feb06Controller
 * author     : HYUCK7
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-02-08         HYUCK7         최초 생성
 */
public class Feb06Controller {
    public void execute(Scanner scanner){
    QuizService service = new QuizServiceImpl();
    String[] arr = {"강 민", "최건일", "유재혁", "김아름", "장원종",
            "DP", "BIN", "HASH", "STACK", "Brute Force",
            "Graph", "Greedy", "sort", "Heap", "DFS",
            "Queue", "BFS"};

        while (true) {
        System.out.println("[MENU] 0.EXIT\n ");
        switch (scanner.next()) {
            case "0":
                System.out.println("EXIT");
                return;
            case "1":
                service.quiz1(arr);
                break;
            case "2":
                service.quiz2(arr);
                break;
            case "3":
                service.quiz3(arr);
                break;
            case "4":
                service.quiz4(arr);
                break;
            case "5":
                service.quiz5(arr);
        }
        }
    }
}
