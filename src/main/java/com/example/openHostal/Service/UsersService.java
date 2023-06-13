package com.example.openHostal.Service;

import com.example.openHostal.Entity.Users;
import com.example.openHostal.Repository.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
public class UsersService {

    private  final UsersRepo userRepo;

    @Autowired

    public UsersService(UsersRepo userRepo){

        this.userRepo=userRepo;
    }

    public List<Users> getUser(){ return this.userRepo.findAll();
    }

    //crea un nuevo hostal y actualiza el ya existente
    public ResponseEntity<Object> newUser(Users user) {
        HashMap <String, Object> datos =    new  HashMap<>();
        Optional<Users> res =userRepo.findUserByDocumentNumber(user.getDocumentNumber());

        //Si existe hostal
        if(res.isPresent() && user.getId()==null){

            datos.put("error",true);
            datos.put("message","Ya existe el rol con este nombre");
            return new ResponseEntity<>(
                    datos,
                    HttpStatus.CONFLICT
            );
        }
        datos.put("message","Se guardo con éxito");
        //para actualizar
        if(user.getId()!=null){
            datos.put("message","Se Actualizo con éxito");
        }


        userRepo.save(user);
        datos.put("data",user);

        return new ResponseEntity<>(
                datos,
                HttpStatus.CREATED
        );
    }

    //elimina rol
    public ResponseEntity<Object> deleteUser(Long id){
        HashMap<String, Object> datos =    new  HashMap<>();
        boolean existe = this.userRepo.existsById(id);

        if(!existe){
            datos.put("error",true);
            datos.put("message","No existe un rol con ese id");
            return new ResponseEntity<>(
                    datos,
                    HttpStatus.CONFLICT
            );
        }
        userRepo.deleteById(id);

        datos.put("message","Hostal con id " + id + "borrado exitosamente ");
        return new ResponseEntity<>(
                datos,
                HttpStatus.ACCEPTED
        );
    }

}
