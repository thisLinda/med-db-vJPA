package com.lforlizzi.meddb.controllers;

import com.lforlizzi.meddb.entities.UserModel;
import com.lforlizzi.meddb.services.UserService;
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
public class UsersController {

    @Autowired
    private UserService service;
    /**
     *
     * @param pseudoName, the unique pseudoName of the user
     * @return a user if found, otherwise null
     */
    @Operation(summary = "Get a user by its unique pseudoName", description = "Gets the user if found, otherwise returns null")
    @RequestMapping(value = "/users/{pseudoName}", method= RequestMethod.GET)
    public UserModel getUserByPseudoName(@PathVariable String pseudoName) {
        UserModel user = service.get(pseudoName);
        return(user);
    }

}