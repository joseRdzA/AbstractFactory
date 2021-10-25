package com.company;

import com.company.AbstractFactory.*;

import java.util.Scanner;

public class Main {
    private static Scanner consola = new Scanner(System.in);
    public static void main(String[] args) {


        int a;
        do{
            a = preguntaServicio();
            switch (a){
                case 1:
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
    public static void usarServicio(ServicioFactory factory){
        ServicioInformatico servicio = factory.crearServicio();
        servicio.asignarTrabajo();
        servicio.indicarFechaEntrega();
        servicio.informarPago();
    }

    public static int preguntaServicio(){
        System.out.println("OPCIONES\n" +
                "\n" +
                "1. Solicitar Sevicios Diseño Gráfico \n" +
                "2. Solicitar Servicios Software Educacional \n" +
                "3. Solicitar desarrollo web\n" +
                "4. Cerrar Sistema\n" +
                "Seleccione Numero Opción");
        return Integer.parseInt(consola.nextLine());
    }

}
