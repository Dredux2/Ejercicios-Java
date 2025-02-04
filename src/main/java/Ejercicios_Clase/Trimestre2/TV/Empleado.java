package Ejercicios_Clase.Trimestre2.TV;
public class Empleado {
    private static int contador = 1;
    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;

    public Empleado(String nombre, String cargo, Empleado director) {
        this.id = generarId();
        this.nombre = nombre;
        this.cargo = validarCargo(cargo);
        if (this.cargo.equals("director")) {
            this.director = null;
        } else {
            this.director = director;
        }
    }

    // region Getters y Setters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = validarCargo(cargo);
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }
    // endregion

    private String generarId() {
        return String.format("EP%03d", contador++);
    }

    private String validarCargo(String cargo) {
        cargo = cargo.toLowerCase();
        if (cargo.equals("director")
                || cargo.equals("técnico")
                || cargo.equals("presentador")
                || cargo.equals("colaborador")) {
            return cargo;
        } else {
            return "pte";
        }
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", director=" + (director != null ? director.getNombre() : "N/A") +
                '}';
    }
}