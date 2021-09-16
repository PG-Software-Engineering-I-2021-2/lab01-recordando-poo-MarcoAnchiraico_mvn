package cs.ing.software.lab1;

public class Camion extends Vehiculo{

    Camion(double cantidad, double consumo, double capacidad){
        super(cantidad, consumo, capacidad);
    }

    @Override
    String recargar(double litros){
        double capacidadLibre = this.capacidad - this.cantidad;

        if(litros>capacidadLibre){
            return "Camion no se puede reabastecer el tanque, esta lleno";
        } else {
            this.cantidad+=(litros * 0.95);
            return "La cantidad de combustible del camion es: "+cantidad;
        }
    }

    @Override
    String conducir(double distancia){
        double necesita = distancia*this.consumo;
        if(this.cantidad-necesita<0){
            return ("El camion necesita reabastecimiento de combustible");
        } else {
            this.cantidad -= necesita;
            return ("Camion viajo " +(distancia)+" km y aun tiene " +String.format("%.2f",this.cantidad)+ " de combustible");
        }
    }
}
