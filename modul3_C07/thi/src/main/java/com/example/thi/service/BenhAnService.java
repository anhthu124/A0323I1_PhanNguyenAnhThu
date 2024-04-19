package com.example.thi.service;

import com.example.thi.model.BenhAn;
import com.example.thi.repository.IBenhAnRepository;
import com.example.thi.repository.impl.BenhAnRepository;

import java.util.List;

public class BenhAnService implements IBenhAnService {
    private IBenhAnRepository benhAnRepository=new BenhAnRepository();
    @Override
    public List<BenhAn> showList() {
        return benhAnRepository.showList();
    }
}
