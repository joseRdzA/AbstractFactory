package com.company.AbstractFactory;

public class FabricaDisenno implements ServicioFactory{
    @Override
    public ServicioInformatico crearServicio() {
        return new ServicioDisenno();
    }


}
