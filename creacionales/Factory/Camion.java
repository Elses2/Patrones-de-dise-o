public class Camion implements Vehiculo{

    String color; 
    String name; 
    public Camion(String color,String name){
        this.color=color; 
        this.name=name; 
    }
    @Override
    public String viaja() {
        // TODO Auto-generated method stub
        return "por tierra";
    }
}