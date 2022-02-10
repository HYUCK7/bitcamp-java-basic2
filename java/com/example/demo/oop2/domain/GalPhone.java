package com.example.demo.oop2.domain;

/**
 * packageName: com.example.demo.oop2.domain
 * fileName   : GalPhone
 * author     : HYUCK7
 * date       : 2022-02-10
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-02-10         HYUCK7         최초 생성
 */
public class GalPhone extends IPhone{
    public final static String KIND = "갤럭시";
    protected String pay;

    public GalPhone(String kind, String company, String move) {
        super(kind, company, move);
    }

    @Override
    public String toString() {
        return String.format("%s에서 만든 %s 제품을 사용해서, %s로 결제한다."
        ,super.getCompany(), KIND, this.pay);
    }
}
