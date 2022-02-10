package com.example.demo.auth.domain;

/**
 * packageName: com.example.demo.grade
 * fileName   : GradeApp1
 * author     : HYUCK7
 * date       : 2022-01-26
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-01-26         HYUCK7         최초 생성
 */
public class GradeDTO {
    private final static GradeDTO gradeDTO = new GradeDTO(); // 고유한 객체를 전역으로 생성
    private GradeDTO(){} // 외부에서부터 값을 받기 위한 생성자???????????
    public static GradeDTO getInstance(){return gradeDTO;}
    public static String GRADE_MARK = "성적표";
    String name;
    int kor;
    int eng;
    int math;

        public String getName() {
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
        public int getKor() {
            return kor;
        }
        public void setKor(int kor) {
            this.kor = kor;
        }
        public int getEng() {
            return eng;
        }
        public void setEng(int eng) {
            this.eng = eng;
        }
        public int getMath() {
            return math;
        }
        public void setMath(int math) {
            this.math = math;
        }
    }

