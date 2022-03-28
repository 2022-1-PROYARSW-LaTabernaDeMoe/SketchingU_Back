package edu.eci.arsw.SketchingU.controllers;

import edu.eci.arsw.SketchingU.model.User;
import edu.eci.arsw.SketchingU.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody User user){
        userService.createUser(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?> getUserEmailById(@RequestParam(name = "id") int id){
        return new ResponseEntity<>(userService.getUserEmailById(id), HttpStatus.FOUND);
    }

    @PostMapping
    public ResponseEntity<?> authorization(@RequestParam(name = "email") String email,
                                           @RequestParam(name = "password") String upassword){
        return new ResponseEntity<>(userService.authorization(email,upassword),HttpStatus.OK);
    }


}
