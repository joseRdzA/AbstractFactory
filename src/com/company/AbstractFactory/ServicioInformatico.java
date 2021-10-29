package com.company.AbstractFactory;

public interface ServicioInformatico {
    //este es el producto abstract oy define lo qe deben tener las clases concretas (métodos)
    public void asignarTrabajo();
    public void indicarFechaEntrega();
    public void informarPago();
}
//clases concretas implementan esta interface (servicioDisenno,SitioWeb,softwareEdu)
