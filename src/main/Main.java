package main;
import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Hola mundo!");

        System.out.println("Ingresa tu nombre");
        String nombre = teclado.next();

        System.out.println("El nombre ingresado fue " + nombre);

        float largo,ancho,alto,volumen;

        System.out.println("ingresa el largo de la caja: ");
        largo = teclado.nextFloat();

        System.out.println("ingresa el ancho de la caja: ");
        ancho = teclado.nextFloat();

        System.out.println("ingresa el alto de la caja: ");
        alto = teclado.nextFloat();
        volumen = largo * ancho * alto;

        System.out.println("El volume de la caja es: " + volumen);
    }

}
