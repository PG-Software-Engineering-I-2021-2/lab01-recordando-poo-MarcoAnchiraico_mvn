package cs.ing.software.lab1;

public class Prueba {

    static double consumoAutomovil = 0.9;
    static double consumoCamion = 1.6;
    static double capacidadVehiculo = 100;

    public static void main(String[] args) {
        double cantidad = 10;
        Automovil hyundai = new Automovil(cantidad, consumoAutomovil, capacidadVehiculo);
        System.out.println(hyundai.conducir(12));
        Camion mitsubishi = new Camion(cantidad, consumoCamion, capacidadVehiculo);
        System.out.println(mitsubishi.conducir(4));
    }

}
