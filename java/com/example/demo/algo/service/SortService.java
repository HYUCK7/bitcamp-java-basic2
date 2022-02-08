package com.example.demo.algo.service;

/**
 * packageName: com.example.demo.algo.service
 * fileName   : SortService
 * author     : HYUCK7
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-02-08         HYUCK7         최초 생성
 */
public interface SortService {
    int[] kNum(int[] array, int[][] commands);
    String bigNum(int[] numbers);
    int hIndex(int[] citations);
}
