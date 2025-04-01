package main;

import clases.Vehiculo;
import clases.Auto;
import clases.Moto;

public class App {
    public static void main(String[] args) throws Exception {
        Vehiculo v1=new Vehiculo("Opressor","MK2",500);
        Auto a1=new Auto("Kuruma","Blindado",260,4);
        Moto m1=new Moto("Bati","Tapizada",120,"Cromado");

        System.out.println("Vehiculos\n"+v1.informacionGeneral()+"\n");
        System.out.println("Autos\n"+a1.informacionGeneral()+"\n");
        System.out.println("Motos\n"+m1.informacionGeneral());
    }
}