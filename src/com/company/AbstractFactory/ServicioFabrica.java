package com.company.AbstractFactory;

public interface ServicioFabrica {
    //Es la fabrica abstracta, tiene el metodo de instanciacipon que devuelve el producto abstracto
    //clases que lo implementan son las fabricas concretas(FabricaSoftware,SitioWeb,Diseño)

    public ServicioInformatico crearServicio(); //así devuelven el servicio correspondido
}
