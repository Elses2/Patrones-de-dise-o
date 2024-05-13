public class Barco implements Vehiculo{

    ///atributos
    String name; 
    String color; 
    /// constructor
    public Barco(String color,String name){

        this.color=color; 
        this.name=name; 

    }
    @Override
    public String viaja() {
        // TODO Auto-generated method stub
        return "por agua";
    }


    
}