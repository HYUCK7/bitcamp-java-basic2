package com.example.demo.controller;

import com.example.demo.algorithm.Queue;
import com.example.demo.algorithm.Stack;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : DemoController2
 * author     : HYUCK7
 * date       : 2022-01-27
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-01-27         HYUCK7         최초 생성
 */
public class AlgoController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack();
        Queue queue = new Queue();
        while (true) {
            System.out.println("[MENU] 0.EXIT\n" +
                    "[김아름] 1. STACK \t"  +
                    "2. QUEUE \t" +
                    "3. HEAP \n" +
                    "[유재혁] 4. HASH \t" +
                    "5. SORT \n" +
                    "[장원종] 6. BRUTE FORCE \t" +
                    "7. DFS \t" +
                    "8. BFS \n" +
                    "[강민] 9. DP \t" +
                    "10. GRAPH \n" +
                    "[최건일] 11.BIN SEARCH \t" +
                    "12.GREEDY");
            switch (scanner.next()){
                case"0": return;
                case"1":
                    System.out.println(stack.solution(null)); break;
                case"2":
                    System.out.println(queue.solution(0,0,null));
                default:
                    System.out.println("WRONG NUMBER");
            }
        }
    }
}