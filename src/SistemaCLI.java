import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SistemaCLI {

    Scanner sc;
    BufferedReader br;

    public SistemaCLI() {
        this.sc = new Scanner(System.in);
        this.br = new BufferedReader(new InputStreamReader(System.in));
    }

    public Vehiculo crearVehiculo(){

        System.out.println("Ingrese los datos del vehiculo: ");
        System.out.print("Placa: ");
        String placa = sc.next();

        System.out.print("Color: ");
        String color = sc.next();

        System.out.print("Kilometraje: ");
        int kilometraje = sc.nextInt();

        System.out.print("Tipo: ");
        String tipo = sc.next();

        System.out.print("Marca: ");
        String marca = sc.next();

        System.out.print("Modelo: ");
        String modelo = "";
        try {
            modelo = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.print("Cilindraje: ");
        double cilindraje = sc.nextDouble();

        System.out.print("Combustible 1.Gasolina/2.Diesel: ");
        int aux = sc.nextInt();
        String combustible = aux == 1 ? "Gasolina" : "Diesel";

        System.out.print("Año compra: ");
        int anio = sc.nextInt();

        System.out.print("Precio compra: ");
        double precio = sc.nextDouble();

        Vehiculo v1 = new Vehiculo(placa,color,kilometraje,
                                    tipo,marca,cilindraje,combustible,
                                    modelo,anio,precio);

        return v1;
    }

    public Duenio crearDuenio(){
        String nombre="";
        String cedula="";
        int edad=0;
        try {
            System.out.println("Ingrese los datos del duenio:");
            System.out.print("Nombre: ");
            nombre = br.readLine();
            System.out.print("Cédula: ");
            cedula = sc.next();
            System.out.print("Edad: ");
            edad = sc.nextInt();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Duenio duenio = new Duenio(nombre,cedula,edad);
        return duenio;
    }

    public void imprimirTorque(Vehiculo v){
        double tr = v.torque();
        System.out.println("El torque del vehiculo con placas: " + v.getPlaca() + " es: " + tr + " Nm.");
    }

    public void imprimirPrecioActual(Vehiculo v){
        double pr = v.precioActual(2026);
        System.out.println("El precio actual del vehículo es: USD " + pr);
    }





}
