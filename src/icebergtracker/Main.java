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
import icebergtracker.repository.IcebergRepository;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

/**
 * @author Antonio Miguel Martel
 */
public class Main {


    public static void main(String[] args) {
        IcebergRepository repo = new IcebergRepository();
        Iceberg iceberg1 = new Iceberg("Manolo",  LocalDate.of(2000, Month.DECEMBER, 16), Origin.Glacier);
        repo.add(iceberg1);

        IcebergEvent volumenManolo1 = new IcebergVolume(222.2,
                                    LocalDate.of(2000, Month.DECEMBER, 18),
                                    iceberg1);
        

        IcebergEvent fragmentaManolo = new IcebergFragmented(
                        new String[]{"Manolo2","Manolo3" ,"Manolo4" ,"Manolo5"},
                        LocalDate.of(2000, Month.DECEMBER, 26),
                        iceberg1);
        
        repo.add(fragmentaManolo);
        repo.add(volumenManolo1);
        List<IcebergEvent> buscaEnRepo = repo.getEvent("Manolo");
        for (IcebergEvent icebergEvent : buscaEnRepo) {
            System.out.println(icebergEvent.devuelveDatos());
        }
        
        
        
    }

}
