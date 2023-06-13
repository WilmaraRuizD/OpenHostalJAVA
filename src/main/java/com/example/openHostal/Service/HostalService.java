package com.example.openHostal.Service;

import com.example.openHostal.Entity.Hostal;
import com.example.openHostal.Repository.HostalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

//Capa de servicios
@Service
public class HostalService {

    private  final HostalRepo hostalRepo;


  @Autowired
  public HostalService(HostalRepo hostalRepo){
      this.hostalRepo=hostalRepo;
  }
  //Trae todos los hostales Get
    public List<Hostal> getHostal(){
        return this.hostalRepo.findAll();
    }

    //crea un nuevo hostal y actualiza el ya existente
    public ResponseEntity<Object> newHostal(Hostal hostal) {
        HashMap <String, Object> datos =    new  HashMap<>();
        Optional<Hostal> res = hostalRepo.findHostalByName(hostal.getName());

        //Si existe hostal
        if(res.isPresent() && hostal.getId()==null){

            datos.put("error",true);
            datos.put("message","Ya existe el hostal con este nombre");
            return new ResponseEntity<>(
                    datos,
                    HttpStatus.CONFLICT
            );
        }
        datos.put("message","Se guardo con éxito");
        //para actualizar
        if(hostal.getId()!=null){
            datos.put("message","Se Actualizo con éxito");
        }


        hostalRepo.save(hostal);
        datos.put("data",hostal);

        return new ResponseEntity<>(
                datos,
                HttpStatus.CREATED
        );
  }
//elimina hostal
  public ResponseEntity<Object>  deleteHostal(Long id){
      HashMap <String, Object> datos =    new  HashMap<>();
      boolean existe = this.hostalRepo.existsById(id);

      if(!existe){
          datos.put("error",true);
          datos.put("message","No existe un hostal con ese id");
          return new ResponseEntity<>(
                  datos,
                  HttpStatus.CONFLICT
          );
      }
     hostalRepo.deleteById(id);

      datos.put("message","Hostal con id " + id + "borrado exitosamente ");
      return new ResponseEntity<>(
              datos,
              HttpStatus.ACCEPTED
      );
  }
}
