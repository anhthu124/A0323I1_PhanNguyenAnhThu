package com.example.phone.repository;

import com.example.phone.model.Phone;

import java.util.List;

public interface IPhoneRepo {
    List<Phone> showList();
    List<Phone> searchPhone(String name);
    void addPhone(Phone phone);
    void removePhoneById(int id);
    void updatePhone(Phone phone);
}
