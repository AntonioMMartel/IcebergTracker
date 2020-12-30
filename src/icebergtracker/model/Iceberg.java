/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package icebergtracker.model;

import java.time.LocalDate;

/**
 * @author Antonio Miguel Martel
 */
public class Iceberg {
    
    private final String id;
    //Pudimos haber usado spawn en vez de sightDate pero spawn significa aparecer
    //Pero los icebergs no aparecen de repente, sino que se avistan
    private final LocalDate sightDate; 
    private final Origin origin;

    public Iceberg(String id, LocalDate sightDate, Origin origin) {
        this.id = id;
        this.sightDate = sightDate;
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Iceberg{" + "id=" + id + ", sightDate=" + sightDate + ", origin=" + origin + '}';
    }

    public String getId() {
        return id;
    }

    public LocalDate getSightDate() {
        return sightDate;
    }

    public Origin getOrigin() {
        return origin;
    }
    
    
    
    
    
}
