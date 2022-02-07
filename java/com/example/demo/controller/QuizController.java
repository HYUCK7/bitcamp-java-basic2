package com.example.demo.controller;

import com.example.demo.service.QuizService;
import com.example.demo.service.QuizServiceImpl;

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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuizService service = new QuizServiceImpl();
        String student = "";
        String subject = "";
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






