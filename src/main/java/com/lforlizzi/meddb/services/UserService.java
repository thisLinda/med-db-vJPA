package com.lforlizzi.meddb.services;

import com.lforlizzi.meddb.entities.UserModel;

import java.util.List;

public interface UserService {
    /**
     * searches the users for any occurrences of the specified user
     * @param pseudoName, the regular expression or part of the pseudo name we want to search
     * @return returns the matching users if found, otherwise returns an empty list
     */
    List<UserModel> search(String pseudoName);

    /**
     * creates a new user
     * @param newUser the new user information
     * @return the new user information that was created and/or validated
     */
    UserModel create(UserModel newUser);

    /**
     * deletes or removes a user
     * @param id, the unique id of the user
     * @return true if deleted or false if user doesn't exist or failed
     */
    boolean delete(int id);

    /**
     * updates a user with new information
     * @param id the unique id of the user
     * @param updatedUser, the updated or new user information
     * @return the updated user information or null if fails
     */
    // TODO: add all fields for updates
    UserModel update(int id, UserModel updatedUser);

    /**
     * retrieves a single user by pseudoName
     * @param pseudoName the unique pseudoName of the user
     * @return the user if found, null if otherwise
     */
    UserModel get(String pseudoName);

//    UserModel get(int id);
}