package tarealabo;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class EjercicioLabo2 {
    
    public static void CrearLista(){        
        String[] lista = new String[]{"elemento", "agua", "comida"};
        
        elegirPalabra(lista);
    }
    
    public static void menu(){
        Scanner in = new Scanner(System.in);
        
        System.out.println("MENÚ");
        System.out.println("Presione 1 para jugar");
        System.out.println("Presione 2 para salir");
        int opcion = in.nextInt();
        
        switch (opcion){
            case 1: 
                CrearLista(); break;
            case 2:
                System.out.println("Juego Finalizado"); break;
            default:{
                System.out.println("Error");
                menu();
            }
        }
        
    }
    
    public static void elegirPalabra(String[] lista){
        Random generador = new Random();
        
        int numeroPalabra = generador.nextInt(2);
        System.out.println(numeroPalabra);
        String palabra = lista[numeroPalabra];
        
        System.out.println(palabra);
        ahorcado(palabra, numeroPalabra);
    }
    
    public static void ahorcado(String palabra, int numeroPalabra){
        Scanner in = new Scanner(System.in);
        
        char[] listaCaracteres = new char[palabra.length()];
        int intentos = 0;
        boolean victoria = false;
        String letra, respuesta = palabra.toString();
        char caracter;
       
       while(victoria == false && intentos <=10){
            System.out.println("Intentos: " + intentos);
            System.out.println("Ingrese una letra");
            letra = in.nextLine();
            caracter = letra.charAt(0);
           
            for (int i = 0; i < palabra.length(); i++){
                if(letra.charAt(0) == palabra.charAt(i)){
                   listaCaracteres[i] = caracter;
                }
            }
           
            for (int i = 0; i < palabra.length(); i++){
                   System.out.print("[" + listaCaracteres[i] + "]");
            }
            
            System.out.println("");

            if (Arrays.equals(palabra.toCharArray(), listaCaracteres)){
                victoria = true;
            }else
                intentos ++;
       }
        
        if(victoria == false){
            System.out.println("Perdiste");
            System.out.println("La respuesta era: " + respuesta);
        }
        else
            System.out.println("Ganaste");
    }
}
