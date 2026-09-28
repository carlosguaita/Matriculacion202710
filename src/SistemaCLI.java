import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SistemaCLI {

    Scanner sc = new Scanner(System.in);

    public Vehiculo crearVehiculo(){

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Vehiculo v1 = new Vehiculo();
        System.out.println("Ingrese los datos del vehiculo: ");
        System.out.print("Placa: ");
        v1.placa = sc.next();
        System.out.print("Color: ");
        v1.color = sc.next();
        System.out.print("Kilometraje: ");
        v1.kilometraje = sc.nextInt();
        System.out.print("Tipo: ");
        v1.tipo = sc.next();
        System.out.print("Marca: ");
        v1.marca = sc.next();
        System.out.print("Modelo: ");
        try {
            v1.modelo = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.print("Cilindraje: ");
        v1.cilindraje = sc.nextDouble();
        System.out.print("Combustible 1.Gasolina/2.Diesel: ");
        int aux = sc.nextInt();
        v1.combustible = aux == 1 ? "Gasolina" : "Diesel";
        return v1;
    }

    public void imprimirTorque(Vehiculo v){
        double tr = v.torque();
        System.out.println("El torque del vehiculo con placas: " + v.placa + " es: " + tr + " Nm.");
    }


}
