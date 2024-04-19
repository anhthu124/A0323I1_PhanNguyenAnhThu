package com.example.be_fitness.service;

import com.example.be_fitness.model.Acount;
import com.example.be_fitness.repository.IAcountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class acountService implements IAcountService {
    @Autowired
    IAcountRepository iAcountRepository ;

    @Override
    public void saveAcount(Acount acount) {
        iAcountRepository.save(acount);
    }

    @Override
    public boolean checkExistingAccountByAcount(String email) {
        return iAcountRepository.existsByEmail(email);
    }
}
