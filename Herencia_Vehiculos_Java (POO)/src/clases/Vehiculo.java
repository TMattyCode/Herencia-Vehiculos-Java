package clases;

public class Vehiculo {
    private String Marca;
    private String Modelo;
    private int maxVelocidad; 

    public Vehiculo(){
        Marca="";
        Modelo="";
        maxVelocidad=0;
    }

    public Vehiculo(String Marca,String Modelo,int maxVelocidad){
        this.Marca=Marca;
        this.Modelo=Modelo;
        this.maxVelocidad=maxVelocidad;
    }

    public Vehiculo(Vehiculo vehiculo){
        this.Marca=vehiculo.Marca;
        this.Modelo=vehiculo.Modelo;
        this.maxVelocidad=vehiculo.maxVelocidad;
    }

    public String informacionGeneral(){
        return "Modelo: "+Marca+"\nModelo: "+Modelo+"\nVelocidad Maxima: "+String.valueOf(maxVelocidad);
    }

    public String getMarca(){
        return Marca;
    }

    public String getModelo(){
        return Modelo;
    }

    public int getMaxVelocidad(){
        return maxVelocidad;
    }
}
