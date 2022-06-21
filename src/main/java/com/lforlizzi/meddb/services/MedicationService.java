package com.lforlizzi.meddb.services;

import com.lforlizzi.meddb.entities.MedicationModel;

import java.util.List;

public interface MedicationService {
    /**
     * Searches the medications for any occurrence of a specified med
     * @param brandName, the regular expression or part of the med searched for
     * @return returns the matching meds if found, otherwise returns an empty list
     */
    List<MedicationModel> search(String brandName);

    MedicationModel get(int id);
}
