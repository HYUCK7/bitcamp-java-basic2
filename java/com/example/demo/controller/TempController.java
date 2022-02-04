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
 * 2022-02-03         HYUCK7         최초 생성 3,8,13
 */
public class TempController {
    public static void main(String[] args) {
        String[] arr = {"강민", "최건일", "유재혁", "김아름", "장원종",
                           "DP", "BIN", "HASH", "STACK", "Brute Force",
                         "Graph", "Greedy", "sort", "Heap", "DFS",
                                    "", "", "", "Queue", "BFS"};
        String s = " ";
        for (int i = 0; i < arr.length; i++) {
            if (i % 5 == 0) {
                s += "\n";
            }
            s += i + ":" + arr[i] + "\t";
        }
        System.out.println(s);
        System.out.println("\n");

        System.out.println("팀장이 맡은 과제만 출력하세요.");
        s = "";
        String a = "유재혁";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(a)) {
                for (int j = 0; j<4; j++) {
                    s += arr[i + j*5] + ",";
                }
            }if (i == 17) {
                break;}
        }
        System.out.println(s);
        System.out.println("\n");

        s = "";
        String l = "Greedy";
        System.out.println("입력한 과목의 인덱스를 찾아주세요");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(l)){
                s = arr[i] + "의 담당자: " + arr[i%5];
        System.out.println(s);
    }
    }
        System.out.println("팀원별과제수 출력");
        int count = 0;
        String countManager = "";
        countManager = arr[0] + "(2개)";
        countManager = arr[1] + "(2개)";
        countManager = arr[2] + "(2개)";
        countManager = arr[3] + "(3개)";
        countManager = arr[4] + "(3개)";
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        // int 배열 생성해서~
        for(int i = 0; i<21; i++){
            if(arr[i].equals(arr[5])){
                count0++;
            }
            if(arr[i].equals(arr[6])){
                count1++;
            }
            if(arr[i].equals(arr[7])){
                count2++;
            }
            if(arr[i].equals(arr[8])){
                count3++;
            }
            if(arr[i].equals(arr[9])){
                count4++;
            }
            countManager += arr[i]+"(3개),\n";

        }
        System.out.println(countManager);
    }
    }

