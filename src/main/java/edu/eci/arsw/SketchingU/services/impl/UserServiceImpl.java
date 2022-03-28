package edu.eci.arsw.SketchingU.services.impl;

import edu.eci.arsw.SketchingU.model.User;
import edu.eci.arsw.SketchingU.persistence.UserPersistance;
import edu.eci.arsw.SketchingU.persistence.impl.UserPersistanceImpl;
import edu.eci.arsw.SketchingU.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserPersistance userPersistance;

    public UserServiceImpl(){
    }

    @Override
    public void createUser(User user) {
        userPersistance.createUser(user);
    }

    @Override
    public String getUserEmailById(int id) {
        return userPersistance.getUserEmailById(id);
    }

    @Override
    public Boolean authorization(String email, String upassword) {
        return userPersistance.authorization(email,upassword);
    }
}
