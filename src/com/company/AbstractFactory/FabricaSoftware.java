package com.company.AbstractFactory;

public class FabricaSoftware implements ServicioFabrica {
    @Override
    public ServicioInformatico crearServicio() {
        return new ServicioSoftwareEducacional();
    }
}
