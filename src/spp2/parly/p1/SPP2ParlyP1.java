/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.parly.p1;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class SPP2ParlyP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Presentación
                
        //Variables
        Scanner teclado = new Scanner (System.in);
        int unidad, sistema, distancia;
        double cantidad, respuesta;
        
        //Ejecución
        System.out.println("Convertidor de unidades");
        System.out.println("Escoja el tipo de unidad");
        System.out.println("1. Líquidos");
        System.out.println("2. Distancias");
        System.out.println("3. Temperaturas");
        System.out.println("4. Pesos");
        System.out.println("5. Salir");
        unidad = teclado.nextInt();
        System.out.println(" ");
         
                //Operaciones
        switch (unidad) {
            case 1:
                System.out.println("Convertidor de líquidos.");
                switch (tiposistema()){
                    case 1:
                        System.out.print("Ingrese la cantidad de litros: ");
                        respuesta = (pedircantidad())*(0.264);
                        System.out.println(" litros = " + respuesta + " galones");
                        break;
                    case 2: 
                        System.out.println("Ingrese la cantidad de galones: ");
                        respuesta = (pedircantidad())*(3.785);
                        System.out.println((" galones = " + respuesta + " litros"));
                        break;
                        
                    
                } break;
                
            case 2:
                System.out.println("Convertidor de distancias.");
                sistema = tiposistema();
                switch (sistema){
                    case 1:
                        System.out.println("Seleccione el tipo de unidad");
                        System.out.println("1. Centímetros");
                        System.out.println("2. Metros");
                        System.out.println("3. Kilómetros");
                        switch (distancia()){
                            case 1:
                                System.out.println("Ingrese la cantidad de centímetros: ");
                                respuesta = (pedircantidad())*(0.394);
                                System.out.println(" centímetros = " + respuesta + " pulgadas");
                                break;                        
                            case 2:
                                System.out.print("Ingrese la cantidad de metros: ");
                                respuesta = (pedircantidad())*(3.28);
                                System.out.println(" metros = " + respuesta + " pies");
                                break;
                            case 3:
                                System.out.print("Ingrese la cantidad de kilómetros: ");
                                respuesta = (pedircantidad())*(0.6213);
                                System.out.println(" kilómetros = " + respuesta + " millas");
                                break;
                            
                        } break;
                    case 2:
                        System.out.println("Seleccione el tipo de unidad");
                        System.out.println("1. Pulgadas");
                        System.out.println("2. Pies");
                        System.out.println("3. Millas");
                        switch (distancia()){
                            case 1:
                                System.out.print("Ingrese la cantidad de pulgadas: ");
                                respuesta = (pedircantidad())*(2.54);
                                System.out.println(" pulgadas = " + respuesta + " centímetros");
                                break;                        
                            case 2:
                                System.out.print("Ingrese la cantidad de pies: ");
                                respuesta = (pedircantidad())*(0.3048);
                                System.out.println(" pies = " + respuesta + " metros");
                                break;
                            case 3:
                                System.out.print("Ingrese la cantidad de millas: ");
                                respuesta = (pedircantidad())*(1.609344);
                                System.out.println(" millas = " + respuesta + " kilómetros");
                                break;
                            default: 
                                System.out.println("Adios!");
                        
                } 
                }break;
                
            case 3:
                System.out.println("Convertidor de temperaturas.");
                switch (tiposistema()){
                    case 1:
                        System.out.print("Ingrese la cantidad de Celsius: ");
                        respuesta=((pedircantidad())*(1.8))+ (32);
                        System.out.println(" grados Celsius = " + respuesta + " Fahrenheit");
                        break;
                    case 2: 
                        System.out.println("Ingrese la cantidad de Fahrenheit: ");
                        respuesta = ((pedircantidad())-32)*(0.555555);
                        System.out.println((" grados Fahrenheit = " + respuesta + " Celsius"));
                        
                }break;
                
            case 4:
                System.out.println("Convertidor de pesos.");
                switch (tiposistema()){
                    case 1:
                        System.out.print("Ingrese la cantidad de gramos: ");
                        respuesta=((pedircantidad())* 0.00220462);
                        System.out.println(" gramos = " + respuesta + " libras");
                        break;
                    case 2: 
                        System.out.println("Ingrese la cantidad de libras: ");
                        respuesta = ((pedircantidad()*453.592));
                        System.out.println((" libras = " + respuesta + " gramos" ));
                        
                }break;
                
            default:
                System.out.println("Adios!");
                break;
            
        }   
        }
        
        
     static int tiposistema (){
     Scanner teclado = new Scanner (System.in);
     int sistema;
     
     System.out.println("1. Sistema métrico decimal");
     System.out.println("2. Sistema inglés");
     sistema = teclado.nextInt();
     System.out.println(" ");
     
     return sistema;
 }   
 static double pedircantidad(){
     Scanner teclado = new Scanner (System.in);
     double cantidad;
     
     cantidad = teclado.nextDouble();
     System.out.print(cantidad);
     
     return cantidad;
             
 }
 static int distancia (){
     Scanner teclado = new Scanner (System.in);
     int distancia;
     
     distancia = teclado.nextInt();
     System.out.println(" ");
     return distancia;
 }
}
