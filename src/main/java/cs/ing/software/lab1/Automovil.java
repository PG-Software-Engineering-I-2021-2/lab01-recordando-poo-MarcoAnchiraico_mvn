package cs.ing.software.lab1;

public class Automovil extends Vehiculo{

    Automovil(double cantidad, double consumo, double capacidad){
        super(cantidad, consumo, capacidad);
    }

    @Override
    String recargar(double litros){
        double capacidadLibre = this.capacidad - this.cantidad;

        if(litros>capacidadLibre){
            return "Automovil no se puede reabastecer el tanque, esta lleno";
        } else {
            this.cantidad+=litros;
            return "La cantidad de combustible del automovil es: "+cantidad;
        }
    }
}
