package Ejercicios_Clase.Trimestre2.Taller;
public class AppVehiculos {
    public static void main(String[] args) {
        Avion airbus = new Avion("Airbus", "DWQJ54", 2000);
        Tren ave = new Tren("Renfe", "FJEWF2", 2000);
        airbus.info();
        ave.info();
        airbus.ruido();
        ave.ruido();
    }
}