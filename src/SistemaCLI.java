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
        String placa = sc.next();
        v1.setPlaca(placa);
        System.out.print("Color: ");
        v1.setColor(sc.next());
        System.out.print("Kilometraje: ");
        v1.setKilometraje(sc.nextInt());
        System.out.print("Tipo: ");
        v1.setTipo(sc.next());
        System.out.print("Marca: ");
        v1.setMarca(sc.next());
        System.out.print("Modelo: ");
        try {
            v1.setModelo(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.print("Cilindraje: ");
        v1.setCilindraje(sc.nextDouble());
        System.out.print("Combustible 1.Gasolina/2.Diesel: ");
        int aux = sc.nextInt();
        v1.setCombustible(aux == 1 ? "Gasolina" : "Diesel");
        System.out.print("Año compra: ");
        v1.setAnioCompra(sc.nextInt());
        System.out.print("Precio compra: ");
        v1.setPrecio(sc.nextDouble());
        return v1;
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
