package com.company.AbstractFactory;

public class ServicioSitioWeb implements ServicioInformatico{
    @Override
    public void asignarTrabajo() {
        System.out.println("Personal de Desarrollo Web aceptó su trabajo");
    }

    @Override
    public void indicarFechaEntrega() {
        System.out.println("Departamento de desarrollo web indica fecha límite de entrega: 28/10/2021");
    }

    @Override
    public void informarPago() {
        System.out.println("El pago es puede ser efectuado mediante PayPal, transacción bancaria o bien en efectivo");
    }
}
