package com.lforlizzi.meddb.repositories;

import com.lforlizzi.meddb.entities.UserModel;

// aka DAO
public interface UserRepository {
    /**
     * retrieves a single user by pseudoName
     * @param pseudoName the unique pseudoName of the user
     * @return the user if found, null if otherwise
     */
    UserModel get(String pseudoName);

}