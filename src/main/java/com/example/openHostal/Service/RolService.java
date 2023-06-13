package com.example.openHostal.Service;

import com.example.openHostal.Entity.Hostal;
import com.example.openHostal.Entity.Rol;
import com.example.openHostal.Repository.RolRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
public class RolService {

    private  final RolRepo rolRepo;

    @Autowired

    public RolService(RolRepo rolRepo){

        this.rolRepo=rolRepo;
    }

    public  List<Rol> getRol(){ return this.rolRepo.findAll();
        }

    //crea un nuevo hostal y actualiza el ya existente
    public ResponseEntity<Object> newRol(Rol rol) {
        HashMap <String, Object> datos =    new  HashMap<>();
        Optional<Rol> res =rolRepo.findRolByNameRol(rol.getNameRol());

        //Si existe hostal
        if(res.isPresent() && rol.getId()==null){

            datos.put("error",true);
            datos.put("message","Ya existe el rol con este nombre");
            return new ResponseEntity<>(
                    datos,
                    HttpStatus.CONFLICT
            );
        }
        datos.put("message","Se guardo con éxito");
        //para actualizar
        if(rol.getId()!=null){
            datos.put("message","Se Actualizo con éxito");
        }


        rolRepo.save(rol);
        datos.put("data",rol);

        return new ResponseEntity<>(
                datos,
                HttpStatus.CREATED
        );
    }


    //elimina rol
    public ResponseEntity<Object>  deleteRol(Long id){
        HashMap <String, Object> datos =    new  HashMap<>();
        boolean existe = this.rolRepo.existsById(id);

        if(!existe){
            datos.put("error",true);
            datos.put("message","No existe un usuario con ese id");
            return new ResponseEntity<>(
                    datos,
                    HttpStatus.CONFLICT
            );
        }
        rolRepo.deleteById(id);

        datos.put("message","Usuario con id " + id + "borrado exitosamente ");
        return new ResponseEntity<>(
                datos,
                HttpStatus.ACCEPTED
        );
    }

    }
