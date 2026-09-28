//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Main{
    public static void main() {

        SistemaCLI sis = new SistemaCLI();
        Vehiculo v1 = sis.crearVehiculo();
        sis.imprimirTorque(v1);

        Vehiculo v2 = sis.crearVehiculo();
        sis.imprimirTorque(v2);


    }
}