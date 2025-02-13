package Ejercicios_Clase.Trimestre2.Empresa;
public class AppEmpresa {
    public static void main(String[] args) {
        Empleado[] empleados = {
                new Desarrollador(),
                new Diseñador(),
                new Gerente()
        };

        System.out.println("=== Usando el array polimorfico ===");
        for (Empleado Trabajador : empleados) {
            Trabajador.realizarTarea();
        }
        System.out.println();



        Empleado empleado1 = new Desarrollador();
        Empleado empleado2 = new Gerente();

        System.out.println("=== Usando el método asignarTarea ===");
        asignarTarea(empleado1);
        asignarTarea(empleado2);
    }

    public static void asignarTarea(Empleado empleado){
        System.out.println("Asignando tarea al empleado...");
        empleado.realizarTarea();
        System.out.println();
    }
}
