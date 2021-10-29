package com.company.AbstractFactory;

public class FabricaDisenno implements ServicioFabrica {
    @Override
    public ServicioInformatico crearServicio() {
        return new ServicioDisenno();
    }


}
