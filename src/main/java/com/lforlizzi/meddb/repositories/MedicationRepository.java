package com.lforlizzi.meddb.repositories;

import com.lforlizzi.meddb.entities.MedicationModel;

public interface MedicationRepository {
    // note to self, id in instruction code is String so I changed the get to pseudoName to utilize
    // `equalsIgnoreCase`... intellij then needed to add the get(int id) below
    MedicationModel findById(int id);

    int getId();

    MedicationModel get(String brandName);
}