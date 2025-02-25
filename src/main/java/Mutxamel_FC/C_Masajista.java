package Mutxamel_FC;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
public class C_Masajista extends A_MutxamelFC {
    private String titulacion;
    private int agesExperiencia;

    public C_Masajista(String nombre, int edad, String titulacion, int agesExperiencia) {
            super(nombre, edad);
            this.titulacion = titulacion;
            this.agesExperiencia = agesExperiencia;
    }

    public void darMasaje() {
        System.out.println("El masajista " + getNombre() + " esta dando un masaje...");
    }

    @Override
    public void concentrarse() {
        System.out.println("El masajista " + getNombre() + " se esta concentrando en el partido...");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El masajista " + getNombre() + " esta viajando a " + ciudad);
    }

    @Override
    public void celebrerGol() {
        System.out.println("GOOOOOOOOOOOOOOL");
    }
}
