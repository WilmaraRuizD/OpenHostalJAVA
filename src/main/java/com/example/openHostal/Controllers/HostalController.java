package com.example.openHostal.Controllers;

import com.example.openHostal.Entity.Hostal;
import com.example.openHostal.Service.HostalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/hostal")

public class HostalController {

private final HostalService hostalService ;

@Autowired
public HostalController(HostalService hostalService){

    this.hostalService = hostalService ;
}

    @GetMapping
    public List<Hostal>getHostal(){
    return  hostalService.getHostal();
}

//    @GetMapping
//    public ResponseEntity<Object> buscarHostal(Long id){
//    return ResponseEntity.ok(id);
//    }

    @PostMapping
    public ResponseEntity<Object> HostalCreado(@RequestBody Hostal hostal){
    return this.hostalService.newHostal(hostal);

    }

    @PutMapping
    public ResponseEntity<Object> HostalActualizado(@RequestBody Hostal hostal){
        return this.hostalService.newHostal(hostal);
    }

    @DeleteMapping(path = "{hostalId}")

    public ResponseEntity<Object> HostalEliminado(@PathVariable("hostalId") Long id){
    return this.hostalService.deleteHostal(id);
    }
}
