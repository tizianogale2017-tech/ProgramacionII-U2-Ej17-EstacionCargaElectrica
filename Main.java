package Ejercicio17_estacionCargaElectrica;

public class Main {
    public static void main(String[] args) {
        VehiculoElectrico auto = new VehiculoElectrico("Renault Kwid E-Tech", 40.0, 8.0);
        SurtidorElectrico surtidor = new SurtidorElectrico(50.0);

        surtidor.iniciarCarga(auto, 60);
    }
}
