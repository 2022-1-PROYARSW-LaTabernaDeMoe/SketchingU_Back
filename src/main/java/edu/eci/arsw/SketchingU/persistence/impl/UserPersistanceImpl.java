package edu.eci.arsw.SketchingU.persistence.impl;

import edu.eci.arsw.SketchingU.model.User;
import edu.eci.arsw.SketchingU.persistence.UserPersistance;
import edu.eci.arsw.SketchingU.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Service
public class UserPersistanceImpl implements UserPersistance {


    @Autowired
    UserRepository userRepository;

    @PersistenceContext
    EntityManager entityManager;

    public UserPersistanceImpl(){
    }
    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }

    @Override
    public String getUserEmailById(int id) {
        Query query = entityManager.createNativeQuery("select email from user_data where id=?");
        query.setParameter(1,id);
        return (String) query.getSingleResult();
    }

    @Override
    public Boolean authorization(String email, String upassword) {
        Query query = entityManager.createNativeQuery("select id from user_data where email=? and upassword=?");
        query.setParameter(1,email);
        query.setParameter(2,upassword);
        Integer id = (Integer) query.getSingleResult();
        if(id !=null){
            return true;
        }return false;
    }


}
