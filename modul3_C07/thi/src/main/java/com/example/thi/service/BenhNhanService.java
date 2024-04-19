package com.example.thi.service;

import com.example.thi.dto.BenhNhanDto;
import com.example.thi.repository.IBenhNhanRepository;
import com.example.thi.repository.impl.BenhNhanRepository;

import java.util.List;

public class BenhNhanService implements IBenhNhanService {
private IBenhNhanRepository benhNhanRepository=new BenhNhanRepository();
    @Override
    public List<BenhNhanDto> showList() {
        return benhNhanRepository.showList();
    }
}
