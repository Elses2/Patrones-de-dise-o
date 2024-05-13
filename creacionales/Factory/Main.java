public class Main{

    public static void main(String [] args){
        Factory fact = new Factory(); 

        Barco x = (Barco)fact.crear(Factory.Tipo.B);
        Camion y= (Camion)fact.crear(Factory.Tipo.C);

        System.out.println("Barco x viaja "+x.viaja());
        System.out.println("Camion y viaja "+y.viaja());




    }



}