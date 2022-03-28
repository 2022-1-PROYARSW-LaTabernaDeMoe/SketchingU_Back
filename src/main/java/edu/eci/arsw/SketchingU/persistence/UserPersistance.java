package edu.eci.arsw.SketchingU.persistence;

import edu.eci.arsw.SketchingU.model.User;

public interface UserPersistance {

    void createUser(User user);
    String getUserEmailById(int id);
    Boolean authorization(String email,String upassword);
   // void deleteUser(User user);

}
