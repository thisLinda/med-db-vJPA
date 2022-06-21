package com.lforlizzi.meddb.services;

import com.lforlizzi.meddb.entities.MedicationModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicationServiceImpl implements MedicationService {
    @Override
    public List<MedicationModel> search(String brandName) {
        return null;
    }

    @Override
    public MedicationModel get(int id) {
        return null;
    }
}
