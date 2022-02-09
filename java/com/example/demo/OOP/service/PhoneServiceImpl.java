package com.example.demo.OOP.service;

import com.example.demo.OOP.domain.CellPhone;
import com.example.demo.OOP.domain.GalPhone;
import com.example.demo.OOP.domain.IPhone;
import com.example.demo.OOP.domain.Phone;

import java.util.Scanner;

/**
 * packageName: com.example.demo.service
 * fileName   : PhoneServiceImpl
 * author     : HYUCK7
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-02-08         HYUCK7         최초 생성
 */
public class PhoneServiceImpl implements PhoneService {
    @Override
    public void usePhone(Phone phone) {
        System.out.println(phone.toString());
    }

    @Override
    public void useCellPhone(CellPhone phone) {
        System.out.println(phone.toString());
    }

    @Override
    public void useIPhone(IPhone phone) {
        System.out.println(phone.toString());
    }

    @Override
    public void useGalPhone(GalPhone phone) {
        System.out.println(phone.toString());
    }
}