//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Main{
    public static void main() {

        SistemaCLI sis = new SistemaCLI();
        Vehiculo v1 = sis.crearVehiculo();
        double tor = v1.torque();

        System.out.println("El vehiculo con placas: " + v1.placa + " de marca " + v1.marca);
        System.out.println("tiene un torque de: " + tor + " Nm.");


    }
}