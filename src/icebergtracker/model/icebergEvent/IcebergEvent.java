/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icebergtracker.model.icebergEvent;

import icebergtracker.model.Iceberg;
import java.time.LocalDate;

/**
 *
 * @author Usuario
 */
public abstract class IcebergEvent {
    protected LocalDate date;
    protected Iceberg iceberg;
    
    //Printea todos los datos de ese evento
    
    public abstract String devuelveDatos();  
}
