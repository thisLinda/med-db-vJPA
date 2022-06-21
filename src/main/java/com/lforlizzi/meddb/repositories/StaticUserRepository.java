package com.lforlizzi.meddb.repositories;

import com.lforlizzi.meddb.entities.UserModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class StaticUserRepository implements UserRepository {
    private ArrayList<UserModel> users;

    public StaticUserRepository() {
        users = new ArrayList<UserModel>();
        users.add(new UserModel( 100, "ClaireRF",  50, "01/01/21", "02/02/21", "I69.391", "R13.12"));
        users.add(new UserModel( 101, "JamesMF",  47, "03/03/21", "04/04/21", "G20", "R13.12"));
        users.add(new UserModel( 102, "BriannaFW",  31, "05/05/21", "06/06/21", "G31.83", "R13.11"));
        users.add(new UserModel( 100, "RogerW",  39, "01/01/21", "02/02/21", "K20.0", "R13.14"));
    }

    // note to self, id in instruction code is String so I changed the get to pseudoName to utilize
    // `equalsIgnoreCase`
    @Override
    public UserModel get(String pseudoName) {
        for(UserModel user: users) {
            if (user.getPseudoName().equalsIgnoreCase(pseudoName)) {
                return(user);
            }
        }
        return(null);
    }

}
