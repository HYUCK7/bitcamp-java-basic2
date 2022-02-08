package com.example.demo.algo.controller;

import com.example.demo.algo.service.*;

import java.util.Scanner;

/**
 * packageName: com.example.demo.algo.controller
 * fileName   : AlgoController
 * author     : HYUCK7
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-02-08         HYUCK7         최초 생성
 */
public class AlgoController {
    public void execute(Scanner scanner) {
        BfsService bfsService = new BfsServiceImpl();
        BinaryService binaryService = new BinaryServiceImpl();
        BruteService bruteService = new BruteServiceImpl();
        DfsService dfsService = new DfsServiceImpl();
        DpService dpService = new DpServiceImpl();
        GraphService graphService = new GraphServiceImpl();
        GreedyService greedyService = new GreedyServiceImpl();
        HashService hashService = new HashServiceImpl();
        HeapService heapService = new HeapServiceImpl();
        QueueService queueService = new QueueServiceImpl();
        SortService sortService = new SortServiceImpl();
        StackService stackService = new StackServiceImpl();

        while (true) {
            System.out.println("[담당] 0. 종료 1. 강민 2. 최건일 3. 유재혁 4. 김아름 5. 장원종");
            switch (scanner.next()) {
                case "0":
                    System.out.println("Exit");
                    return;
                case "1":
                    System.out.println("0. 종료  1. Dp  2. Graph");
                    switch (scanner.next()) {
                        case "0":
                            System.out.println("Exit");
                            return;
                        case "1":
                            break;
                        case "2":
                            break;
                    }
                case "2":
                    System.out.println("0. 종료 1. Bin  2. Greedy");
                    switch (scanner.next()) {
                        case "0":
                            System.out.println("Exit");
                            return;
                        case "1":
                            switch (scanner.next()) {
                                case "0":
                                    System.out.println("Exit");
                                    return;
                                case "1":
                            }
                            break;
                        case "2":
                            break;
                    }
                case "3":
                    System.out.println("0. 종료 1. Hash  2. Sort");
                    switch (scanner.next()) {
                        case "0":
                            System.out.println("EXIT");
                            return;
                        case "1":
                            System.out.println("0. 종료 1. 완주하지 못한 선수 2. 전화번호 목록 3.   ");
                            switch (scanner.next()) {
                                case "0":
                                    System.out.println("Exit");
                                    return;
                                    case "1":
                                        break;
                                    case "2":
                                        break;
                                    case "3":
                                        break;
                                    case "4":
                                        break;
                                }

                                case "2":
                                    switch (scanner.next()) {
                                        case "0":
                                            return;
                                        case "1":
                                            break;
                                        case "2":
                                            break;
                                        case "3":
                                            break;

                                    }
                            }

                case "4":
                    System.out.println("0. 종료 1. Stack 2. Heap 3. Queue");
                    switch (scanner.next()) {
                        case "0":
                            System.out.println("Exit");
                            return;
                        case "1":
                            break;
                        case "2":
                            break;
                        case "3":
                            break;
                    }
                case "5":
                    System.out.println("0. 종료 1. Brute Force  2. DFS  3. BFS");
                    switch (scanner.next()) {
                        case "0":
                            System.out.println("Exit");
                            return;
                        case "1":
                            break;
                        case "2":
                            break;
                        case "3":
                            break;
                    }
            }
        }
    }
}

