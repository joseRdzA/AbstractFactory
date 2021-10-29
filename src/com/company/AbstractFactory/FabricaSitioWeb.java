package com.company.AbstractFactory;

public class FabricaSitioWeb implements ServicioFabrica {
    @Override
    public ServicioInformatico crearServicio() {
        return new ServicioSitioWeb();
    }


}
