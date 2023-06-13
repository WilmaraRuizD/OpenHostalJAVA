package com.example.openHostal.Controllers;


import com.example.openHostal.Entity.Hostal;
import com.example.openHostal.Entity.Rol;
import com.example.openHostal.Service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/rol")

public class RolController {

    private final RolService rolService;

    @Autowired

    public RolController(RolService rolService){

        this.rolService = rolService ;
    }

    @GetMapping
    public List<Rol> getRol(){
        return  this.rolService.getRol();

        }

    @PostMapping
    public ResponseEntity<Object> RolCreado(@RequestBody Rol rol){
        return this.rolService.newRol(rol);

    }

    @PutMapping
    public ResponseEntity<Object> rolActualizado(@RequestBody Rol rol){
        return this.rolService.newRol(rol);
    }
    @DeleteMapping(path = "{RolId}")

    public ResponseEntity<Object> RolEliminado(@PathVariable("RolId") Long id){
        return this.rolService.deleteRol(id);
    }




}
