package tarealabo;

import java.util.Scanner;


public class EjercicioLabo3 {
    public static void CrearLista(){
        Scanner in = new Scanner(System.in);

        System.out.print("Seleccione la longitud del arreglo: ");
        int longitud = in.nextInt();
        int[] lista = new int[longitud];

        for (int i =0; i < longitud; i++){
            System.out.println("Ingrese el numero " + (lista[i]+1) + " de la lista ");
            lista[i] = in.nextInt();in.nextLine();
            System.out.println("[" + lista[i] + "] ");
        }
        Suma(longitud, lista);
    }
    
    public static void Suma(int longitud, int[] lista){
        
        System.out.println("Llegue");
        int suma = 0;
        for (int i =0; i < longitud; i++){
            suma += lista[i];
        }
        System.out.println("La suma total es: " + suma);
        Media(longitud, suma);
        System.out.println("Me muero");
    }
    //73498
    public static void Media(int denominador, float suma){
        
        float resultado = 0;
        resultado = suma/denominador;
        
        System.out.println("La media es: " + resultado);
        
        System.out.println("Me muero x2");
    }
}
