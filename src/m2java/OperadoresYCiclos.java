package m2java;

/*
 * EJERCICIO:
 * - Crea ejemplos utilizando todos los tipos de operadores de tu lenguaje:
 *   Aritméticos, lógicos, de comparación, asignación, identidad, pertenencia, bits...
 *   (Ten en cuenta que cada lenguaje puede poseer unos diferentes)
 * - Utilizando las operaciones con operadores que tú quieras, crea ejemplos
 *   que representen todos los tipos de estructuras de control que existan
 *   en tu lenguaje:
 *   Condicionales, iterativas, excepciones...
 * - Debes hacer print por consola del resultado de todos los ejemplos.
 *
 */

public class OperadoresYCiclos {
    
    public static void main(String[] args) {
        
        // OPERADORES ARITMÉTICOS
        int num1 = 10;
        int num2 = 6;
        
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;
        int resultadoModulo = num1 % num2;
        
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);
        System.out.println("Modulo: " + resultadoModulo);
        
        
        // OPERADORES LÓGICOS
        boolean bool1 = true;
        boolean bool2 = false;
        boolean bool3 = true;
        
        // AND: &&
        // OR: ||
        // NOT: !
        
        boolean resultadoAND = bool1 && bool2 && bool3;
        boolean resultadoOR = bool1 || bool2;
        boolean resultadoNOT = !bool1;
        
        System.out.println("AND: " + resultadoAND);
        System.out.println("OR: " + resultadoOR);
        System.out.println("NOT: " + resultadoNOT);
        
        
        // OPERADORES DE COMPARACIÓN
        boolean resultadoIgual = (num1 == num2);
        boolean resultadoDesigual = (num1 != num2);
        boolean resultadoMayorQue = (num1 > num2);
        boolean resultadoMenorQue = (num1 < num2);
        boolean resultadoMayorIgual = (num1 >= num2);
        boolean resultadoMenorIgual = (num1 <= num2);
        
        System.out.println("Igual: " + resultadoIgual);
        System.out.println("Desigual: " + resultadoDesigual);
        System.out.println("Mayor que: " + resultadoMayorQue);
        System.out.println("Menor que: " + resultadoMenorQue);
        System.out.println("Mayor o igual que: " + resultadoMayorIgual);
        System.out.println("Menor o igual que: " + resultadoMenorIgual);
        
        // Ejemplo 
        int edad = 5;
        
        if (edad >= 14 && edad <= 18) {
            System.out.println("Si puede entrar al campamento");
        } else {
            System.out.println("No cumple con la edad para el campamento");
        }
        
        
        
        // OPERADORES DE ASIGNACIÓN
        int contador = 5;
        int operadorSuma = contador += 10; // contador = contador + 10;
        int operadorResta = contador -= 3;
        int operadorMultiplicacion = contador *= 2;
        int operadorDivision = contador /= 4;
        
        // contador++; // contador = contador + 1;

        System.out.println("Operador Suma: " + operadorSuma);
        System.out.println("Operador Resta: " + operadorResta);
        System.out.println("Operador Multiplicacion: " + operadorMultiplicacion);
        System.out.println("Operador Division: " + operadorDivision);
        
        
        System.out.println("-------------- CICLOS --------------");
        System.out.println("------------------------------------");
        
        // CICLO FOR
        for (int i = 0; i < 10; i++) {
            //System.out.println(i);
        }
        
        // CICLO WHILE
        int contador2 = 0;
        while (contador2 < 10) {
            //System.out.println(contador2);
            contador2++;
        }
        
        contador = 0;
        // CICLO DO-WHILE
        do {
            System.out.println(contador);
            contador++; // contador = contador + 1;
        } while (contador < 10);
        
        
        // CICLO INFINITO
        /*
        for (int i = -10; i < 10; i--) {
            System.out.println(i);
        }
        */
        
        
        
        
    }
    
    
}
