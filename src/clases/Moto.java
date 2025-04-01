package clases;

public class Moto extends Vehiculo{
    private String Manubrio;

    public Moto(){
        super();
        Manubrio="";
    }

    public Moto(String Marca,String Modelo,int maxVelocidad,String Manubrio){
        super(Marca,Modelo,maxVelocidad);
        this.Manubrio=Manubrio;
    }

    public Moto(Moto moto){
        super(moto.getMarca(),moto.getModelo(),moto.getMaxVelocidad());
        this.Manubrio=moto.Manubrio;
    }

    public String informacionGeneral(){
        return super.informacionGeneral()+"\nTipo Manubrio: "+Manubrio;
    }

    public String getManubrio(){
        return Manubrio;
    }
}
