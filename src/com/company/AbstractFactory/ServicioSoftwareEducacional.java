package com.company.AbstractFactory;

public class ServicioSoftwareEducacional implements ServicioInformatico{
    @Override
    public void asignarTrabajo() {
        System.out.println("El equipo de desarrollo ha sido informado del trabajo a realizar");
    }

    @Override
    public void indicarFechaEntrega() {
        System.out.println("Departamento de desarrollo web indica fecha límite de entrega: 28/10/2021");
    }

    @Override
    public void informarPago() {
        System.out.println("El pago es puede ser efectuado mediante SINPE MÓVIL o bien en efectivo");
    }
}
