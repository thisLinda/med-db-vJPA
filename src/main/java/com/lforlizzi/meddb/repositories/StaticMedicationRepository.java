package com.lforlizzi.meddb.repositories;

import com.lforlizzi.meddb.entities.MedicationModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class StaticMedicationRepository implements MedicationRepository {
  private ArrayList<MedicationModel> medications;

  public StaticMedicationRepository() {
    medications = new ArrayList<MedicationModel>();
    medications.add(new MedicationModel(200, "Haldol", true));
    medications.add(new MedicationModel(201, "Pylera", true));
    medications.add(new MedicationModel(202, "Fosamax", true));
    medications.add(new MedicationModel(203, "Neurontin", true));
    medications.add(new MedicationModel(204, "Gablofen", true));
    medications.add(new MedicationModel(205, "Oxybutynin", true));
    medications.add(new MedicationModel(206, "Coumadin", false));
    medications.add(new MedicationModel(207, "Celexa", false));
    medications.add(new MedicationModel(208, "Protonix", false));
  }

  @Override
  public MedicationModel findById(int id) {
    return null;
  }

  @Override
  public int getId() {
    return 0;
  }

  @Override
  public MedicationModel get(String brandName) {
    return null;
  }
}
