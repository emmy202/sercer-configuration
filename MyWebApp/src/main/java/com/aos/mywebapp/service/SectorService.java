package com.aos.mywebapp.service;

import com.aos.mywebapp.domain.Sector;
import com.aos.mywebapp.repository.SectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SectorService {
    @Autowired
    private SectorRepository sectorRepository;

    public void save(Sector sector) {
        sectorRepository.save(sector);
    }
}
