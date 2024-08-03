package m2java;

import java.util.ArrayList;
import java.util.List;

public class EstructurasTipoLista {
    
    public static void main(String[] args) {
        
        // ARREGLOS - ARRAY
        String autos[] = {"BMW", "Volvo", "Ford", "Mazda"};
        
        //System.out.println(autos.length);
        
        // Con este ciclo, necesito conocer la dimensión del arreglo
        for (int i = 0; i < autos.length; i++) {
            //System.out.println(autos[i]);
        }
        
        // Con For-Each no necesito conocer la dimensión, ni manejar el indice
        for (String auto : autos) {
            System.out.println(auto.toUpperCase());
            System.out.println(auto.charAt(0));
            System.out.println(auto.length());
        }
        
        // ---------------------------------------------
        System.out.println("---------------------------------------------");
        
        // LISTAS
        List<String> nombres = new ArrayList<>();
        
        // Agregamos datos a la lista
        nombres.add("Javiera");
        nombres.add("Tomas");
        nombres.add("Joaquin");
        
        // Me retorna la dimensión de mi lista
        System.out.println(nombres.size());
        
        
        // Recorre la lista con un For-Each
        for (String e : nombres) {
            //System.out.println(e);
        }
        
        // Usar forEach a través de la lista.
        //nombres.forEach(System.out::println);
        
        
        // Sirve para obtener un dato a través del índice.
        System.out.println(nombres.get(2));
        
        // Nos elimina todos los datos de la lista
        //nombres.clear();
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("---------------------------------------------");
        // isEmpty reconoce un campo vacio solamente cuando no tiene nada.
        // isBlank reconoce como campo vacio incluso los espacios.
        String campo = "   ";
        
        if (campo.isBlank()){
            System.out.println("Efectivamente no tiene nada");
        } else {
            System.out.println("Tiene algo");
        }
        
        
        // Limpia los espacios vacios al inicio y final del dato
        String dato = "      nombre apellido ";
        System.out.println(dato.trim());
    }
    
}
