package com.example.be_fitness.service;

import com.example.be_fitness.model.Acount;

public interface IAcountService {
    void saveAcount(Acount acount);
    boolean checkExistingAccountByAcount(String acount);
}
