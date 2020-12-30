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
 * El volumen del iceberg es en m3
 */
public class IcebergVolume extends IcebergEvent{
    private final double volume;

    public IcebergVolume(double volume, LocalDate date, Iceberg iceberg) {
        this.volume = volume;
        this.date = date;
        this.iceberg = iceberg;
    }
    

    @Override
    public String devuelveDatos() {
        return "El volumen del iceberg " + iceberg.getId() + " es de " + volume + "m3 en la fecha: " + date.toString();
    }
    
    
    
}
