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

    @Test
    public void Test02() {
        Camion camion = new Camion(0.9,100,0);
        Assert.assertEquals(camion.recargar(10), "Camion no se puede reabastecer el tanque, esta lleno");
    }

    @Test
    public void Test03(){
        Camion camion2 = new Camion(0.9,100,10);
        Assert.assertEquals(camion2.conducir(40), "El camion necesita reabastecimiento de combustible");
    }

    @Test
    public void Test04() {
        Camion camion3 = new Camion(1,100,10);
        Assert.assertEquals(camion3.recargar(4), "La cantidad de combustible del camion es: 4.8");
    }

    @Test
    public void Test05() {
        Automovil auto3 = new Automovil(1,100,10);
        Assert.assertEquals(auto3.recargar(4), "La cantidad de combustible del automovil es: 5.0");
    }

    @Test
    public void Test06(){
        Camion camion4 = new Camion(200,100,20);
        Assert.assertEquals(camion4.conducir(1), "Camion viajo 1.0 km y aun tiene 100.00 de combustible");
    }

    @Test
    public void Test07(){
        Vehiculo vehiculo1  = new Vehiculo(200,100,20);
        Assert.assertEquals(vehiculo1.conducir(1), "Vehiculo viajo 1.0 km y aun tiene 100.00 de combustible");
    }

    @Test
    public void Test08(){
        Vehiculo vehiculo2  = new Vehiculo(200,100,20);
        Assert.assertEquals(vehiculo2.recargar(1), "");
    }

    @Test(invocationCount = 80, threadPoolSize = 80)
    public void TestDeStress() {
        Camion camion = new Camion(12,consumoCamion,capacidadVehiculo);
        Assert.assertEquals(camion.recargar(100), "Camion no se puede reabastecer el tanque, esta lleno");
    }
}
