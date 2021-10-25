package com.company.AbstractFactory;

public class ServicioDisenno implements ServicioInformatico{
    @Override
    public void asignarTrabajo() {
        System.out.println("Trabajo asignado a diseñadores disponibles...");
    }

    @Override
    public void indicarFechaEntrega() {
        System.out.println("Diseñadores indican fecha límite de entrega: 28/10/2021");

    }

    @Override
    public void informarPago() {
        System.out.println("El pago es puede ser efectuado mediante SINPE MÓVIL o bien en efectivo");
    }
}
