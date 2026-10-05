
package agencia;

public class Vehiculo {

    private String placa;
    private String marca;
    private String modelo;

    public Vehiculo(String placa) {
        this.placa = placa;
        this.marca = "Desconocida";
        this.modelo = "Desconocido";
    }

    public Vehiculo(String placa, String marca) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = "Desconocido";
    }

    public Vehiculo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double calcularMantenimiento(int km) {
        return km * 0.05;
    }

    public double calcularMantenimiento(int km, String tipoServicio) {

        double costo = km * 0.05;

        if (tipoServicio.equalsIgnoreCase("basico")) {
            costo += 500;
        } else if (tipoServicio.equalsIgnoreCase("completo")) {
            costo += 1000;
        }

        return costo;
    }

    public double calcularMantenimiento(int km, String tipoServicio, int piezas) {

        double costo = km * 0.05;

        if (tipoServicio.equalsIgnoreCase("basico")) {
            costo += 500;
        } else if (tipoServicio.equalsIgnoreCase("completo")) {
            costo += 1000;
        }

        costo += piezas * 200;

        return costo;
    }
}