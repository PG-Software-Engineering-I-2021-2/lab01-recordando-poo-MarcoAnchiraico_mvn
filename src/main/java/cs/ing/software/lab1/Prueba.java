package cs.ing.software.lab1;

import java.util.logging.Logger;

public class Prueba {

    static final Logger logger = Logger.getLogger(Prueba.class.getName());

    static double consumoAutomovil = 0.9;
    static double consumoCamion = 1.6;
    static double capacidadVehiculo = 100;

    public static void main(String[] args) {
        inicio();
    }

    public static void inicio() {
        double cantidad = 10;
        Automovil hyundai = new Automovil(cantidad, consumoAutomovil, capacidadVehiculo);
        String hyundaiConducir = hyundai.conducir(12);
        logger.info(hyundaiConducir);
        Camion mitsubishi = new Camion(cantidad, consumoCamion, capacidadVehiculo);
        String mitsubishiConducir = mitsubishi.conducir(4);
        logger.info(mitsubishiConducir);
        Vehiculo vehiculo1 = new Vehiculo(cantidad, consumoCamion, capacidadVehiculo);
        String vehiculoRecargar = vehiculo1.recargar(4);
        logger.info(vehiculoRecargar);
    }

}
