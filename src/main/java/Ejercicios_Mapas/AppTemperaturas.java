package Ejercicios_Mapas;
public class AppTemperaturas {
    public static void main(String[] args) {
        RegistroTemperaturas registro1 = new RegistroTemperaturas();
        registro1.insertarTemperaturas("Alicante", 32);
        registro1.actualizarTemperatura("Madrid");
        registro1.consultarTemperatura();
        registro1.mostrar();
    }
}