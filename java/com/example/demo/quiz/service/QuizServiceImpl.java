package com.example.demo.quiz.service;

import com.example.demo.quiz.service.QuizService;

/**
 * packageName: com.example.demo.service
 * fileName   : QuizService
 * author     : HYUCK7
 * date       : 2022-02-07
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-02-07         HYUCK7         최초 생성
 */
public class QuizServiceImpl implements QuizService {
    @Override
    public void quiz1(String[] arr) {
        String team = " ";
        System.out.println("Q1. 팀별 과제를 출력하세요 ");
        for (int i = 0; i < arr.length; i++) {
            if (i % 5 == 0) {
                team += "\n";
            }
            team += i + ":" + arr[i] + "\t";
            if (i == 21) {
                break;
            }
        }
        System.out.println(team);
    }

    @Override
    public void quiz2(String[] arr) {
        String ae = "";
        System.out.println("Q2. 팀장이 맡은 과제만 출력하세요. 예) 김진영, 힙, 그래프 ");
        String tm = "최건일";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(tm)) {
                for (int j = i; j < arr.length; j = j + 5) {
                    ae += j + " : " + arr[j] + ",\t";
                }
            }
            if (i == 20) {
                break;
            }
        }
        System.out.print(ae);
    }

    @Override
    public void quiz3(String[] arr) {
        System.out.println("\n");
        String subject = "큐";
        String student = "";
        System.out.println("Q3. 큐를 담당한 사람을 출력하세요. 예) 큐를 담당한 사람: 김아름 "); //arr[17]를 담당한 사람: arr[2];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(subject)) {
                student = arr[i%5];
            }
            if(i==20){break;}
        }
        System.out.println(subject + "를 담당한 사람 : " + student);
    }

    @Override
    public void quiz4(String[] arr) {
        String subject = "";
        String student = "";
        // arr[19] , arr[14] , arr[9] : arr[4]
        student = "";
        subject = "큐";
        System.out.println("Q4. 큐를 담당한 사람을 출력하세요. 예) 큐를 담당한 사람: 김아름 ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(subject)) {
                for (int j = 0; j < 4; j++) {
                    student += arr[i - 5 * j] + "," + "\t";
                }
            }
            if (i == 20) {
                break;
            }
        }
        System.out.print(student);
        System.out.println("\n");
    }

    @Override
    public void quiz5(String[] arr) {
        System.out.println("Q4. 팀원별 과제 수를 출력하세요 "
                +"예) 권혜민(3개), 조현국(3개), 김진영(2개), 김한슬(2개), 서성민(2개) ");
        int[] intArr = new int[5];
        int[] resArr = new int[5];
        for(int i = 5; i< arr.length; i++){
            int a = i%5;                        // a에 과목 별로 누구껀지 나머지로 연산
           for(int j = 0; j<5; j++ ){
               if(a == j) {
                    intArr[j]++;
               }
               resArr = intArr;
           }
        }
        for(int i=0; i<5; i++){
            System.out.println(arr[i]+"("+resArr[i]+")");
        }

    }
}
