package com.example.demo.oop2.service;

import com.example.demo.oop2.domain.CellPhone;
import com.example.demo.oop2.domain.GalPhone;
import com.example.demo.oop2.domain.IPhone;
import com.example.demo.oop2.domain.Phone;

/**
 * packageName: com.example.demo.oop2.service
 * fileName   : PhoneService
 * author     : HYUCK7
 * date       : 2022-02-10
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-02-10         HYUCK7         최초 생성
 */
public interface PhoneService {
    void usePhone(Phone phone);
    void useCellPhone(CellPhone cellPhone);
    void useIPhone(IPhone iPhone);
    void useGalPhone(GalPhone galPhone);
}
