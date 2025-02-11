package Ejercicios_Clase.Trimestre2.ExamenUD5;
import lombok.*;
import java.util.ArrayList;
import java.util.Arrays;
@ToString @Getter @Setter
public class Corredor {
    public static int numDorsal = 0;
    private String nombre;
    private int dorsal;
    private ArrayList<String> listaPatrocinadores;
    private double importe_vuelta;
    private int numero_vueltas;

    public Corredor (String nombre, double importe_vuelta){
        setNombre(nombre);
        setImporte_vuelta(importe_vuelta);
        listaPatrocinadores = new ArrayList<>();
        numDorsal++;
        dorsal = numDorsal;
        numero_vueltas = 0;
    }

    public void setImporte_vuelta(double importe_vuelta) {
        if (importe_vuelta == 0){
            this.importe_vuelta = 0.50;
        } else {
            this.importe_vuelta = importe_vuelta;
        }
    }

    public void insertarPatrocinador(String... patrocinadores){
        listaPatrocinadores.addAll(Arrays.asList(patrocinadores));
    }
}