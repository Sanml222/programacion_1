public class Vehiculo {
    String marca = "";
    String modelo = "";
    String año = "";

    Vehiculo(String marca, String modelo, String año){
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public String infoVehiculo(){
        String informacion = "Estimado usuario la marca del vehiculo es " + this.marca + " el modelo correspondiente es " + this.modelo + " y su respectivo año es " + this.año;
        return informacion;
    }
    
    public static void main(String[] args){
        Vehiculo vehiculo1 = new Vehiculo("KIA", "rio", "2019");
        System.out.println(vehiculo1.infoVehiculo());
    }

    
}
