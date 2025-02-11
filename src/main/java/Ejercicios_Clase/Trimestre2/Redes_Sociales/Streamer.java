package Ejercicios_Clase.Trimestre2.Redes_Sociales;
public class Streamer extends Usuario {
    private int numero_retransmisiones;
    private int horas_directo;

    public Streamer(String nombre, int edad, String usr, int seguidores, int numero_retransmisiones, int horas_directo) {
        super(nombre, edad, usr, seguidores);
        this.numero_retransmisiones = numero_retransmisiones;
        this.horas_directo = horas_directo;
    }

    public void info(){
        super.info();
        System.out.println("Número de retransmisiones: " + numero_retransmisiones);
        System.out.println("Horas en directo: " + horas_directo);
    }
}
