/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package icebergtracker.model.icebergEvent;

import icebergtracker.model.Iceberg;
import java.time.LocalDate;

/**
 * @author Antonio Miguel Martel
 */
public class IcebergLocation extends IcebergEvent {
    
    private final double x;
    private final double y;

    public IcebergLocation(double x, double y,  LocalDate date, Iceberg iceberg) {
        this.date = date;
        this.iceberg = iceberg;
        this.x = x;
        this.y = y;
    }
    
    
    
    @Override
    public String devuelveDatos() {
        return "La posicion del iceberg " + iceberg.getId() + " es: x=" + x + " y=" + y + " en la fecha: " + date.toString();
    }
    
    
}
