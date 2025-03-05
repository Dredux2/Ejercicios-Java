package Mutxamel_FC;
import lombok.*;
@AllArgsConstructor @Getter @Setter
/*
  Clase abstracta que representa a los integrantes del equipo de fútbol de Mutxamel.
  Implementa la interfaz I_FuncionesIntegrantes.
 */
public abstract class MutxamelFC implements FuncionesIntegrantes {
    private String nombre;
    private int edad;
}