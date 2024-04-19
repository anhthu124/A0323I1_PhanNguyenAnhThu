package com.example.phone2.repository;

import com.example.phone2.model.Phone;

import java.util.List;

public interface IPhoneRepo {
    List<Phone> showList();
    List<Phone> searchPhone(String name);
    void addPhone(Phone phone);
    void removePhoneById(int id);
    void updatePhone(Phone phone);
}
