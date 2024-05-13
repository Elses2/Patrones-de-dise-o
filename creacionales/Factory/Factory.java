public class Factory{

    public enum Tipo{
        C,B/// c: camion    b: barco
    }
    public Factory(){}
    public Vehiculo crear(Tipo tipo){
        switch (tipo ) {
            case B:
                return new Barco("rojo","juan");
            case C:
            return new Camion("azul","Pedro");
                
            default:
                System.out.println("Error");
            return null; 
        }

    }
}