package Retos_MoureDev;

import java.io.FileNotFoundException;

public class Dredux2 {
    /*
     * EJERCICIO:
     * Muestra ejemplos de todas las operaciones que puedes realizar con cadenas de caracteres
     * en tu lenguaje. Algunas de esas operaciones podrían ser (busca todas las que puedas):
     * - Acceso a caracteres específicos, subcadenas, longitud, concatenación, repetición,
     *   recorrido, conversión a mayúsculas y minúsculas, reemplazo, división, unión,
     *   interpolación, verificación...
     */
    public static void main(String[] args) {
        // Declaración e inicialización
        String texto1 = "Hola";
        String texto2 = "Mundo";

        // Concatenación
        String concatenacion = texto1 + " " + texto2;
        System.out.println("Concatenación: " + concatenacion);

        // Longitud - Devuelve el número total de caracteres, incluyendo espacios.
        System.out.println("Longitud: " + concatenacion.length());

        // Acceso a un caracter específico
        System.out.println("Caracter en primera posición: " + concatenacion.charAt(0));

        // Subcadena - Extrae una parte específica de la cadena.
        System.out.println("Subcadena (0-4): " + concatenacion.substring(0, 4));

        // Conversión a mayúsculas y minúsculas
        System.out.println("Mayúsculas: " + concatenacion.toUpperCase());
        System.out.println("Minúsculas: " + concatenacion.toLowerCase());

        // Reemplazo - Sustituye una parte de la cadena por otra.
        System.out.println("Reemplazo: " + concatenacion.replace("Mundo", "Java"));

        // División - Divide la cadena en partes separadas por espacios.
        String[] partes = concatenacion.split(" ");
        System.out.println("División:");
        for (String parte : partes) {
            System.out.println(parte);
        }

        // join - Une las partes usando un delimitador especificado.
        String unidas = String.join("-", partes);
        System.out.println("Unidas: " + unidas);

        // Comparación - Compara las cadenas con y sin diferenciar mayúsculas/minúsculas.
        System.out.println("Comparación (equals): " + texto1.equals("Hola"));
        System.out.println("Comparación (equalsIgnoreCase): " + texto1.equalsIgnoreCase("hOlA"));

        // Verificación de contenido
        System.out.println("Empieza con 'Hola': " + concatenacion.startsWith("Hola"));
        System.out.println("Termina con 'Mundo': " + concatenacion.endsWith("Mundo"));
        System.out.println("Contiene 'la': " + concatenacion.contains("la"));

        // Eliminación de espacios en blanco - Quita espacios antes y despues.
        String cadenaConEspacios = "  Hola Mundo  ";
        System.out.println("Trim: '" + cadenaConEspacios.trim() + "'");

        // Repetición - Repite la cadena un número específico de veces.
        String repetida = texto1.repeat(3);
        System.out.println("Repetición: " + repetida);

        // Recorrido - Itera sobre cada caracter en la cadena.
        System.out.println("Recorrido:");
        for (char c : concatenacion.toCharArray()) {
            System.out.print(c + " ");
        }
        System.out.println();

        // Conversión - Convierte otros tipos de datos a cadenas.
        int numero = 123;
        String numeroStr = String.valueOf(numero);
        System.out.println("Conversión de número a String: " + numeroStr);

        // Interpolación - Combina valores dentro de una plantilla.
        String formato = String.format("%s %s!", texto1, texto2);
        System.out.println("Interpolación: " + formato);

        System.out.println();
        EjercicioExtra();
    }
    /*
     * DIFICULTAD EXTRA (opcional):
     * Crea un programa que analice dos palabras diferentes y realice comprobaciones
     * para descubrir si son:
     * - Palíndromos
     * - Anagramas
     * - Isogramas
     */
    public static void EjercicioExtra(){
        // Palíndromos - Palabras que se leen igual de izquierda a derecha que de derecha a izquierda.
        StringBuilder palabra = new StringBuilder("reconocer");
        String palabraInvertida = palabra.reverse().toString();
        if (palabra.toString().equals(palabraInvertida)) {
            System.out.println("Es un palíndromo");
        } else {
            System.out.println("No es un palíndromo");
        }
        // Anagramas - Palabras que contienen las mismas letras, pero en un orden diferente.

        // Isogramas - Palabras que no contienen letras repetidas.

    }
}