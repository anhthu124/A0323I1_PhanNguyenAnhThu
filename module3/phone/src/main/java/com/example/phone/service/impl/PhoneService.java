package com.example.phone.service.impl;

import com.example.phone.model.Phone;
import com.example.phone.repository.IPhoneRepo;
import com.example.phone.repository.impl.PhoneRepo;
import com.example.phone.service.IPhoneService;

import java.util.List;

public class PhoneService implements IPhoneService {
    IPhoneRepo phoneRepo = new PhoneRepo();

    @Override
    public List<Phone> showList() {
        return phoneRepo.showList();
    }

    @Override
    public List<Phone> searchPhone(String name) {
        return phoneRepo.searchPhone(name);
    }

    @Override
    public void addPhone(Phone phone) {
        phoneRepo.addPhone(phone);
    }

    @Override
    public void removePhoneById(int id) {
        phoneRepo.removePhoneById(id);
    }

    @Override
    public void updatePhone(Phone phone) {
        phoneRepo.updatePhone(phone);
    }
}
