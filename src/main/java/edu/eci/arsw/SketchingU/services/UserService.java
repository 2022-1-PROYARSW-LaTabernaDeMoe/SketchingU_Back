package edu.eci.arsw.SketchingU.services;

import edu.eci.arsw.SketchingU.model.User;

public interface UserService {
    void createUser(User user);
    String getUserEmailById(int id);
    Boolean authorization(String email,String upassword);
}
