package tarealabo;

import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioLabo4 {
    
    public static void menu(ArrayList lista, ArrayList<String> nombreProducto, ArrayList<Double> precioProducto, ArrayList<Integer> cantidadProducto, int longitud){
        Scanner in = new Scanner(System.in);
        
        System.out.println("MENÚ");
        System.out.println("Seleccione 1 para agregar objetos a la lista de compras");
        System.out.println("Selccione 2 para mostrar la lista de compras");
        System.out.println("Seleccione 3 para ver el total");
        System.out.println("Seleccione 0 para salir");
        int opcion = in.nextInt();
        
        switch(opcion){
            case 1:
                agregarObjeto(lista, nombreProducto, precioProducto, cantidadProducto, longitud); break;
            case 2:
                mostraLista(lista, nombreProducto, precioProducto, cantidadProducto, longitud); break;
            case 3:
                mostraTotal(lista, nombreProducto, precioProducto, cantidadProducto, longitud); break;
        }
    }
    
    public static void crearLista(){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Seleccione el tamaño de la lista");
        int longitud = in.nextInt();
        
        ArrayList lista = new ArrayList();
        ArrayList<String> nombreProducto = new ArrayList(longitud);
        ArrayList<Double> precioProducto = new ArrayList(longitud);
        ArrayList<Integer> cantidadProducto = new ArrayList(longitud);
        
        lista.add(nombreProducto);
        lista.add(precioProducto);
        lista.add(cantidadProducto);
        
        menu(lista, nombreProducto, precioProducto, cantidadProducto, longitud);
    }
    
    public static void agregarObjeto(ArrayList lista, ArrayList<String> nombreProducto, ArrayList<Double> precioProducto, ArrayList<Integer> cantidadProducto, int longitud){
        Scanner in = new Scanner(System.in);
        
        for(int i = 0; i < longitud; i++){
            System.out.println("Ingrese el nombre del producto");
            nombreProducto.add(in.nextLine());
            System.out.println("Ingrese el precio del producto");
            precioProducto.add(in.nextDouble());
            System.out.println("Ingrese cantidad del producto");
            cantidadProducto.add(in.nextInt()); in.nextLine();
        }
        
        menu(lista, nombreProducto, precioProducto, cantidadProducto, longitud);
    }   
    
    public static void mostraLista(ArrayList lista, ArrayList<String> nombreProducto, ArrayList<Double> precioProducto, ArrayList<Integer> cantidadProducto, int longitud){

        for(int i = 0; i < longitud; i++){
            System.out.println("Producto " + nombreProducto.get(i) + ", precio " + precioProducto.get(i) + ", cantidad " + cantidadProducto.get(i) + ".");
        }
        menu(lista, nombreProducto, precioProducto, cantidadProducto, longitud);
    }    
    
    public static void mostraTotal(ArrayList lista, ArrayList<String> nombreProducto, ArrayList<Double> precioProducto, ArrayList<Integer> cantidadProducto, int longitud){
        double total = 0;
        
        for(int i = 0; i < longitud; i++){
            System.out.println("Producto " + nombreProducto.get(i) + ", precio " + precioProducto.get(i) + ", cantidad " + cantidadProducto.get(i) + ".");
            total +=(precioProducto.get(i)*cantidadProducto.get(i));
        }
        System.out.println("El total es: " + total);
        menu(lista, nombreProducto, precioProducto, cantidadProducto, longitud);
    }
}
