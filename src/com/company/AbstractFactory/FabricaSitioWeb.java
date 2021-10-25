package com.company.AbstractFactory;

public class FabricaSitioWeb implements ServicioFactory{
    @Override
    public ServicioInformatico crearServicio() {
        return new ServicioSitioWeb();
    }


}
