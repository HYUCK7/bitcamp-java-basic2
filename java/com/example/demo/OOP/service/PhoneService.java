package com.example.demo.OOP.service;

import com.example.demo.OOP.domain.CellPhone;
import com.example.demo.OOP.domain.GalPhone;
import com.example.demo.OOP.domain.IPhone;
import com.example.demo.OOP.domain.Phone;

import java.util.Scanner;

/**
 * packageName: com.example.demo.service
 * fileName   : PhoneService
 * author     : HYUCK7
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-02-08         HYUCK7         최초 생성
 */
public interface PhoneService {
    void usePhone(Phone phone);
    void useCellPhone(CellPhone phone);
    void useIPhone(IPhone phone);
    void useGalPhone(GalPhone phone);
}
