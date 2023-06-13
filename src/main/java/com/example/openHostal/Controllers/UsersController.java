package com.example.openHostal.Controllers;

import com.example.openHostal.Entity.Users;
import com.example.openHostal.Service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/user")
public class UsersController {

    private final UsersService userService;

    @Autowired

    public UsersController(UsersService userService){

        this.userService = userService ;
    }

    @GetMapping
    public List<Users> getUser(){
        return  this.userService.getUser();

    }

    @PostMapping
    public ResponseEntity<Object> UserCreado(@RequestBody Users user){
        return this.userService.newUser(user);

    }

    @PutMapping
    public ResponseEntity<Object> userActualizado(@RequestBody Users user){
        return this.userService.newUser(user);
    }

    @DeleteMapping(path = "{UserId}")

    public ResponseEntity<Object> UserEliminado(@PathVariable("UserId") Long id){
        return this.userService.deleteUser(id);
    }



}
