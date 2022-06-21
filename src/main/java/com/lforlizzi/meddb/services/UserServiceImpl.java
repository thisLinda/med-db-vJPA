package com.lforlizzi.meddb.services;

import com.lforlizzi.meddb.entities.MedicationModel;
import com.lforlizzi.meddb.entities.UserModel;
import com.lforlizzi.meddb.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<UserModel> search(String pseudoName) {
        return new ArrayList<UserModel>();
    }

    @Override
    public UserModel create(UserModel newUser) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public UserModel update(int id, UserModel updatedUser) {
        return null;
    }

    @Override
    public UserModel get(String pseudoName) {
        UserModel model = repository.get(pseudoName);
        // TODO: change model, add more information, etc
        // Read from another repository for extra information
        return (model);
    }

}