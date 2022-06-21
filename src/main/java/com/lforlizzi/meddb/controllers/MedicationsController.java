package com.lforlizzi.meddb.controllers;

import com.lforlizzi.meddb.entities.MedicationModel;
import com.lforlizzi.meddb.entities.UserModel;
import com.lforlizzi.meddb.services.MedicationService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@OpenAPIDefinition(info = @Info(title = "Medications Database"))
public class MedicationsController {

    @Autowired
    private MedicationService service;
    /**
     * Get a specific medication by its id
     * @param id, the unique id of the med
     * @return a med if found, otherwise null
     */
    @Operation(summary = "Get a med by its unique id", description = "Gets the med if found, otherwise returns null")
    @RequestMapping(value = "/medications/{id}", method= RequestMethod.GET)
    public MedicationModel getMedById(@PathVariable int id) {
        MedicationModel medication = service.get(id);
        return(medication);
    }

}