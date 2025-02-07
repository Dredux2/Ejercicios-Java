package Ejercicios_Clase.Trimestre2.Centro_Estudios;
public class AppInstituto {
    public static void main(String[] args) {
        Instituto instituto = new Instituto("IES Los Sauces");
        Instituto instituto2 = new Instituto(null);
        Curso curso1 = new Curso("1º DAM", 2000);
        Curso curso2 = new Curso("2º DAM", 2000);
        Estudiante estudiante1 = new Estudiante("Juan", 18);
        Estudiante estudiante2 = new Estudiante("Ana", 17);
        instituto.addCurso(curso1);
        instituto2.addCurso(curso2);
        instituto.addEstudiante(estudiante1);
        instituto2.addEstudiante(estudiante2);
        System.out.println(instituto);
        System.out.println(instituto2);
    }
}