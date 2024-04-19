package com.example.phones.service.imple;


import com.example.phones.model.Phone;
import com.example.phones.repository.IPhoneRepo;
import com.example.phones.repository.impl.PhoneRepo;
import com.example.phones.service.IPhoneService;

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
