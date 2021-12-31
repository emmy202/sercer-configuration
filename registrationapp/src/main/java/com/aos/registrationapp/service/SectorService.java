package com.aos.registrationapp.service;

import com.aos.registrationapp.domain.Sector;
import com.aos.registrationapp.repository.SectorRepository;
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
