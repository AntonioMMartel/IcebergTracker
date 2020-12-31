/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package icebergtracker.repository;

import icebergtracker.model.Iceberg;
import icebergtracker.model.icebergEvent.IcebergEvent;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Antonio Miguel Martel
 * Esto es como un buscador de objetos, como cuando me voy a mi armario
 * a por un libro. Sin embargo, yo no se como cojo ese libro, cuando quiero 
 * cojer un libro, esto me lo coje y punto, y cuando quiero guardar ese libro
 * esto tambien me lo hace como quiero. Tambien me permite buscar libros segun
 * unas instrucciones que yo le ponga. -> ESTO ES EL PATRON REPOSITORY
 * 
 * 
 * Como este proyecto es pequeño no importa si ambos repositorios estan en 
 * la misma clase, sin embargo, para una siguiente version habria que crear
 * una interfaz para los repositorios y despues 2 implementaciones de la 
 * misma interfaz cada una para cada tipo de repositorio.
 */
public class IcebergRepository {
    List<Iceberg> icebergRepository = new ArrayList<>();
    List<IcebergEvent> icebergEventRepository = new ArrayList<>();
    
    //Estaria super interesante hacer esto con una base de datos
    //Pero pinta que eso es para la kata5
   public void add(Object icebergItem) {
       if (icebergItem instanceof Iceberg) {
           icebergRepository.add((Iceberg) icebergItem);
       } else if (icebergItem instanceof IcebergEvent) {
           icebergEventRepository.add((IcebergEvent) icebergItem);
       } else {
           System.out.println("No se ha añadido el objeto porque no es de tipo Iceberg o IcebergEvent");
       }
       
   }
   
   //Obtiene evento a partir de una id de un iceberg
   public List<IcebergEvent> getEvent(String id) {
       List<IcebergEvent> solution = new ArrayList<>();
       for (IcebergEvent icebergEvent : icebergEventRepository) {
           if(icebergEvent.getIceberg().getId().equals(id)) solution.add(icebergEvent);
       }
       return solution;
   }
   
}
