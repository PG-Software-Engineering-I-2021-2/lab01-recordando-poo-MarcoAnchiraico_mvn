package cs.ing.software.lab1;
import org.testng.Assert;
import org.testng.annotations.Test;

import static cs.ing.software.lab1.Prueba.*;

public class PruebaTest {

    @Test
    public void Test01(){
        Automovil audi = new Automovil(10, consumoAutomovil, capacidadVehiculo);
        Assert.assertEquals(audi.recargar(500),"Automovil no se puede reabastecer el tanque, esta lleno");

        Camion volvo = new Camion(10, consumoAutomovil, capacidadVehiculo);
        Assert.assertEquals(volvo.conducir(4),"Camion viajo 4.0 km y aun tiene 6.40 de combustible");

        Vehiculo sapito = new Vehiculo(10, consumoAutomovil, capacidadVehiculo);
        Assert.assertEquals(sapito.conducir(12),"El vehiculo necesita reabastecimiento de combustible");
    }
}
