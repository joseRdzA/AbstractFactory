package com.company.AbstractFactory;

public interface ServicioFactory {
    //Es la fabrica abstracta, tiene el metodo de instanciacipon que devuelve el producto abstracto
    public ServicioInformatico crearServicio();
}
