import java.time.LocalDate;

public class Vehiculo {

    private String placa;
    private String color;
    private int kilometraje;
    private String tipo;
    private String marca;
    private double cilindraje;
    private String combustible;
    private String modelo;
    private int anioCompra;
    private double precio;
    private Duenio duenio;


    public Vehiculo(String placa, String color, int kilometraje, String tipo, String marca, double cilindraje, String combustible, String modelo, int anioCompra, double precio) {
        this.placa = placa;
        this.color = color;
        this.kilometraje = kilometraje;
        this.tipo = tipo;
        this.marca = marca;
        this.cilindraje = cilindraje;
        this.combustible = combustible;
        this.modelo = modelo;
        this.anioCompra = anioCompra;
        this.precio = precio;
    }

    public Vehiculo() {
    }

    public double torque(){
        double t = 0;
        if (combustible.equals("Gasolina")){
            t = cilindraje * 20;
        }else if (combustible.equals("Diesel")){
            t = cilindraje * 60;
        }
        return t;
    }

    public double precioActual(int anioActual){
        int anios = anioActual - anioCompra;
        double dev = anios * 1500;
        double precio = this.precio - dev;
        return precio;
    }

    public double precioActual(){
        LocalDate fechaActual = LocalDate.now();
        int anios = fechaActual.getYear() - anioCompra;
        double dev = anios * 1500;
        double precio = this.precio - dev;
        return precio;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioCompra() {
        return anioCompra;
    }

    public void setAnioCompra(int anioCompra) {
        this.anioCompra = anioCompra;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
