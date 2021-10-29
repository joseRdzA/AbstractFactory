package com.company;

import com.company.AbstractFactory.*;

import java.util.Scanner;

public class Main {
    private static Scanner consola = new Scanner(System.in);
    public static void main(String[] args) {

        int a;
        do{
            a = preguntaServicio(); //se guarda en a al preguntar servicio
            switch (a){
                case 1: //según lo que ingrese se le pasa una fabrica
                    usarServicio(new FabricaDisenno());
                    break;
                case 2:
                    usarServicio(new FabricaSoftware());
                    break;
                case 3:
                    usarServicio(new FabricaSitioWeb());
                    break;
                case 4:
                    System.out.println("Cerrando sistema...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
            System.out.println("\n");
        } while (a!=4);
    }
    public static void usarServicio(ServicioFabrica factory){ //factory recibe objetos de las clases que implementen esta interfaz (en menu)
        ServicioInformatico servicio = factory.crearServicio(); //se crea un servicio y servicio recibe objetos de los concretos
        //no importa que servicio se pida, estos metodos se ejecutan porque todos los productos tienen estos metodos
        servicio.asignarTrabajo();
        servicio.indicarFechaEntrega();
        servicio.informarPago();
        //implementan al producto abstracto, permite crear objetos de distintas clases para no crearlos directamente sino por fábricas
    }

    public static int preguntaServicio(){
        System.out.println("OPCIONES\n" +
                "\n" +
                "1. Solicitar Sevicios Diseño Gráfico \n" +
                "2. Solicitar Servicios Software Educacional \n" +
                "3. Solicitar desarrollo web\n" +
                "4. Cerrar Sistema\n" +
                "Seleccione Numero Opción");
        return Integer.parseInt(consola.nextLine()); //devuelve opción ingresada
    }

}
