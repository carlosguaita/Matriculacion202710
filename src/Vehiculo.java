public class Vehiculo {

    String placa;
    String color;
    int kilometraje;
    String tipo;
    String marca;
    double cilindraje;
    String combustible;


    public double torque(){
        double t = 0;
        if (combustible.equals("Gasolina")){
            t = cilindraje * 20;
        }else if (combustible.equals("Diesel")){
            t = cilindraje * 60;
        }
        return t;
    }






}
