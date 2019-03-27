package tarealabo;

import java.util.Scanner;
import java.util.Random;

public class EjercicioLabo {

    public static void main(String[] args) {
        NumerosAleatorios();
        EjercicioLabo2.menu();
        EjercicioLabo3.CrearLista();
        EjercicioLabo4.crearLista();
        
        
    }
    
    public static void NumerosAleatorios(){
        Scanner in = new Scanner(System.in);
        Random generador = new Random();

        System.out.print("Seleccione la longitud del arreglo: ");
        int longitud = in.nextInt();
        int[] lista = new int[longitud];

        for (int i =0; i < longitud; i++){
            lista[i] = generador.nextInt(10);
            System.out.println("[" + lista[i] + "] ");
        }
        Suma(longitud, lista);
    }
    
    public static void Suma(int longitud, int[] lista){
        
        System.out.println("Llegue");
        for (int i =0; i < longitud; longitud--, i++){
            System.out.println("[" + (lista[longitud-1]+lista[i]) + "] ");
        }
        System.out.println("Me muero");
    }
}
