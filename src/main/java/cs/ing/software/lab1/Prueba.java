package cs.ing.software.lab1;

import java.util.logging.Logger;

public class Prueba {

    static final Logger logger = Logger.getLogger(Prueba.class.getName());

    static double consumoAutomovil = 0.9;
    static double consumoCamion = 1.6;
    static double capacidadVehiculo = 100;

    public static void main(String[] args) {
        double cantidad = 10;
        Automovil hyundai = new Automovil(cantidad, consumoAutomovil, capacidadVehiculo);
        logger.info(hyundai.conducir(12));
        Camion mitsubishi = new Camion(cantidad, consumoCamion, capacidadVehiculo);
        logger.info(mitsubishi.conducir(4));
    }

}
