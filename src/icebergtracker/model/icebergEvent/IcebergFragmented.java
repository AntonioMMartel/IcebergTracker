/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package icebergtracker.model.icebergEvent;

import icebergtracker.model.Iceberg;
import icebergtracker.model.Origin;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Antonio Miguel Martel
 * la idea del compañero para poner solo los casos fragmentados es mejor que la de
 * divir el iceberg que teniamos en 2, asi nos ahorramos borrar el que teníamos.
 */
public class IcebergFragmented extends IcebergEvent{
    private final List<Iceberg> icebergs = new ArrayList<>();
    
    //Añade los icebergs nuevos por la fragmentacion con
    public IcebergFragmented(String[] icebergs,  LocalDate date, Iceberg iceberg) {
        this.date = date;
        this.iceberg = iceberg;
        for (String fragmento : icebergs) {
            this.icebergs.add(new Iceberg(fragmento, this.date, Origin.Iceberg));
        }
        
    }
    
    @Override
    public String devuelveDatos() {
        return "El iceberg " + iceberg.getId() + " se fragmentó creando " + icebergs.size()
                + " nuevos icebergs llamados:" + muestraFragmentos() + "; en la fecha " + date;
    }

    private String muestraFragmentos() {
        String salida = "";
        for (Iceberg iceberg : icebergs) {
            salida = salida + ", " + iceberg.getId();
        }
       return salida.substring(1);
    }

    public List<Iceberg> getIcebergs() {
        return icebergs;
    }
    
    
}
