package clases;

public class Auto extends Vehiculo {
    private int numPuertas;

    public Auto(){
        super();
        numPuertas=0;
    }

    public Auto(String Marca,String Modelo,int maxVelocidad,int numPuertas){
        super(Marca,Modelo,maxVelocidad);
        this.numPuertas=numPuertas;
    }

    public Auto(Auto auto){
        super(auto.getMarca(),auto.getModelo(),auto.getMaxVelocidad());
        this.numPuertas=auto.numPuertas;
    }

    public String informacionGeneral(){
        return super.informacionGeneral()+"\nNumero de puertas: "+String.valueOf(numPuertas);
    }

    public int getNumPuertas(){
        return numPuertas;
    }
}
