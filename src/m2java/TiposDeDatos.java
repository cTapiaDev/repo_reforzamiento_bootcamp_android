package m2java;

/**
 *
 * EJERCICIO:
 * - Crea un comentario en el código y coloca la URL del sitio web oficial del
 *   lenguaje de programación que has seleccionado.
 * - Representa las diferentes sintaxis que existen de crear comentarios
 *   en el lenguaje (en una línea, varias...).
 * - Crea una variable (y una constante si el lenguaje lo soporta).
 * - Crea variables representando todos los tipos de datos primitivos
 *   del lenguaje (cadenas de texto, enteros, booleanos...).
 * - Imprime por terminal el texto: "¡Hola, [y el nombre de tu lenguaje]!"
 *
 */

public class TiposDeDatos {
    
    public static void main(String[] args) {
        
        /*
            Esto es un comentario
            en bloque
            de más
            de una línea
        */
        
        // Tipos de Datos Primitivos
        String texto = "Hola mundo";
        String java = " en Java";
        int entero = 12342;
        byte num = -128;
        double decimal = 32.45;
        float decimalFloat = 324.3f;
        boolean datoBoleano = true; // false;
        char caracter = 'A';
        
        char simbolo = 'O';
        String simbolo2 = "123412";
        
        final int LONGITUD = 1600;
        
        System.out.println(texto + java);
        
        
        
        // Ejemplo de IF-ELSE
        String stringNumerico = "1234";
        String stringNumero2 = "1234";
        int numerico = 1234;
        int numerico2 = 123666;
        

        if (stringNumerico.equals(stringNumero2)) {
            System.out.println("Es verdero");
        } else {
            System.out.println("Es falso");
        }
        
        
    }
    
}
