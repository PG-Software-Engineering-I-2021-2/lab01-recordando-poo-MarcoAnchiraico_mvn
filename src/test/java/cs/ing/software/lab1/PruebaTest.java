package cs.ing.software.lab1;
import org.testng.Assert;
import org.testng.annotations.Test;

import static cs.ing.software.lab1.Prueba.*;

public class PruebaTest {

    @Test
    public void Test01(){
        Automovil audi = new Automovil(10, consumoAutomovil, capacidadVehiculo);
        Assert.assertEquals(audi.recargar(500),"Automovil no se puede reabastecer el tanque, esta lleno");
    }
}
