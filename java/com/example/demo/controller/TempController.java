package com.example.demo.controller;

/**
 * packageName: com.example.demo.controller
 * fileName   : TempController
 * author     : HYUCK7
 * date       : 2022-02-03
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-02-03         HYUCK7         최초 생성
 */
public class TempController {
    public static void main(String[] args) {
        String[] arr = {"강민", "최건일", "유재혁", "김아름", "장원종",
                         "DP",  "BIN",   "HASH", "STACK","Brute Force",
                        "Graph","Greedy","sort",  "Heap",   "DFS",
                              " " , " ", " ",    "Queue",   "BFS"};

            for(int i=0; i<5; i++){
                System.out.println(arr[i]+ ":" +arr[i+5]+ " " + arr[i+10] +" "+ arr[i+15]);
        }
    }
}