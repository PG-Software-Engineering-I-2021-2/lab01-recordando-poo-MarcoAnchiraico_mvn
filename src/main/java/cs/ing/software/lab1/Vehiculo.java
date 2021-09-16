package cs.ing.software.lab1;

public class Vehiculo {
    double cantidad;
    double consumo;
    double capacidad;

    Vehiculo(double cantidad, double consumo, double capacidad){
        this.cantidad = cantidad;
        this.consumo = consumo;
        this.capacidad = capacidad;
    }

    String recargar(double litros){
        return "";
    }

    String conducir(double distancia){
        double necesita = distancia*this.consumo;
        if(this.cantidad-necesita<0){
            return ("El vehiculo necesita reabastecimiento de combustible");
        } else {
            this.cantidad -= necesita;
            return ("Vehiculo viajo " +(distancia)+" km y aun tiene " +String.format("%.2f",this.cantidad)+ " de combustible");
        }
    }
}
