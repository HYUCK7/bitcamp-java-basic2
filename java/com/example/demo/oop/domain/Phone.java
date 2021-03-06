package com.example.demo.oop.domain;

/**
 * packageName: com.example.demo.OOP.domain
 * fileName   : phone
 * author     : HYUCK7
 * date       : 2022-02-09
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-02-09         HYUCK7         최초 생성
 */
public class Phone {
    protected String kind;
    protected String company;
    protected String call;

    public Phone(String kind, String company){
        this.kind = kind;
        this.company = company;
    }
    public String getKind() {
        return kind;
    }

    public String getCompany() {
        return company;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "kind='" + kind + '\'' +
                ", company='" + company + '\'' +
                ", call='" + call + '\'' +
                '}';
    }
}
