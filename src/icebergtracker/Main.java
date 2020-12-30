/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package icebergtracker;

import icebergtracker.model.Iceberg;
import icebergtracker.model.Origin;
import icebergtracker.model.icebergEvent.IcebergEvent;
import icebergtracker.model.icebergEvent.IcebergFragmented;
import icebergtracker.model.icebergEvent.IcebergVolume;
import java.time.LocalDate;
import java.time.Month;

/**
 * @author Antonio Miguel Martel
 */
public class Main {


    public static void main(String[] args) {
        
        Iceberg iceberg1 = new Iceberg("Manolo",  LocalDate.of(2000, Month.DECEMBER, 16), Origin.Glacier);
        
        
        System.out.println(iceberg1.toString());
        IcebergEvent volumenManolo1 = new IcebergVolume(222.2,
                                    LocalDate.of(2000, Month.DECEMBER, 18),
                                    iceberg1);
        
        System.out.println(volumenManolo1.devuelveDatos());
        
        IcebergEvent fragmentaManolo = new IcebergFragmented(
                        new String[]{"Manolo2","Manolo3" ,"Manolo4" ,"Manolo5"},
                        LocalDate.of(2000, Month.DECEMBER, 26),
                        iceberg1);
        
        System.out.println(fragmentaManolo.devuelveDatos());
        
    }

}
