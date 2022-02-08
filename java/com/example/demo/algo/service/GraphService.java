package com.example.demo.algo.service;

/**
 * packageName: com.example.demo.algo.service
 * fileName   : GraphService
 * author     : HYUCK7
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-02-08         HYUCK7         최초 생성
 */
public interface GraphService {
    int farNode(int n, int[][] edge);     //가장 먼 노드
    int rank(int n, int[][] results);     //순위
    int numRoom(int[] arrows);           //방의 개수
}
