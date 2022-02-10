package com.example.demo.oop2.domain;

/**
 * packageName: com.example.demo.oop2.domain
 * fileName   : IPhone
 * author     : HYUCK7
 * date       : 2022-02-10
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-02-10         HYUCK7         최초 생성
 */
public class IPhone extends CellPhone{
    public final static String KIND = "아이폰";
    protected String search;


    public IPhone(String kind, String company, String move) {
        super(kind, company, move);
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    @Override
    public String toString() {
        return String.format("%s에서 만든 %s을 사용해서 %s 중에 %s를 검색한다."
        ,super.getCompany(),KIND, super.move, this.search);
    }
}
