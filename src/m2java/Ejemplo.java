package m2java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejemplo {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        List<String> nombres = new ArrayList<>();
        
        boolean salir = false;
        
        
        while (salir == false) {
            System.out.println("""
                               ------ Menu ------
                               1. Almacenar Nombre
                               2. Mostrar Lista
                               3. Salir
                               ------------------
                               Ingresa una opcion
                               """);
            
            int opt = Integer.parseInt(input.nextLine());
            
            switch (opt) {
                case 1 -> {
                    System.out.println("------------------------------------");
                    System.out.println("Ingresa el nombre: ");
                    String nombre = input.nextLine();
                    nombres.add(nombre);
                    System.out.println("Nombre ingresado");
                    System.out.println("------------------------------------");
                }
                case 2 -> {
                    System.out.println("--------- Lista de Nombres ---------");
                    for (String e : nombres) {
                        System.out.println(e);
                    }
                    System.out.println("------------------------------------");
                }
                case 3 -> salir = true;
                default -> System.out.println("Ingresa una opcion valida");
            }
                     
        }
        
    }
    
}
