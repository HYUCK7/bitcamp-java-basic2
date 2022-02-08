package com.example.demo.algo.service;

/**
 * packageName: com.example.demo.algo.service
 * fileName   : DfsService
 * author     : HYUCK7
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-02-08         HYUCK7         최초 생성
 */
public interface DfsService {
    int tarnum(int[] numbers, int target);
    int changerWord(String begin, String target, String[] words);
}
