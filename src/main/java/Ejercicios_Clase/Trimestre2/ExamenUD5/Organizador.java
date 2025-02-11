package Ejercicios_Clase.Trimestre2.ExamenUD5;
import lombok.*;
import java.util.ArrayList;
@ToString @Getter @Setter
public class Organizador {
    private static final String ORG_DEF = "IES MUTXAMEL";
    private static final int MAX_CORREDORES = 700;
    private String nombre;
    private String edicion;
    private ArrayList<Corredor> listaCorredores;

    public Organizador (String edicion){
        nombre = ORG_DEF;
        this.edicion = edicion;
        listaCorredores = new ArrayList<>();
    }
}
