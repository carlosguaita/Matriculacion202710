//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Main{
    public static void main() {

        SistemaCLI sis = new SistemaCLI();

        Vehiculo vehiculo = sis.crearVehiculo();
        sis.imprimirTorque(vehiculo);
        sis.imprimirPrecioActual(vehiculo);

        Duenio duenio = sis.crearDuenio();
        vehiculo.setDuenio(duenio);


    }
}