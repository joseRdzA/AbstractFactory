package com.company.AbstractFactory;

public class FabricaSoftware implements ServicioFactory{
    @Override
    public ServicioInformatico crearServicio() {
        return new ServicioSoftwareEducacional();
    }
}
