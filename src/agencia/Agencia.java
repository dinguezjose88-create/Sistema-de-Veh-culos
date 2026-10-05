
package agencia;


public class Agencia {

   
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("A123456");
        Vehiculo vehiculo2 = new Vehiculo("B123456", "Toyota");
        Vehiculo vehiculo3 = new Vehiculo("C123456", "Honda", "Civic");

        System.out.println(vehiculo3.getPlaca());
        System.out.println(vehiculo3.getMarca());
        System.out.println(vehiculo3.getModelo());

        System.out.println("Mantenimiento 1: " + vehiculo3.calcularMantenimiento(10000));

        System.out.println("Mantenimiento 2: " + vehiculo3.calcularMantenimiento(10000, "basico"));

        System.out.println("Mantenimiento 3: " + vehiculo3.calcularMantenimiento(10000, "completo", 2));

        
    }
    
}
