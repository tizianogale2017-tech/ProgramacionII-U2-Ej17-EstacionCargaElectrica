package Ejercicio17_estacionCargaElectrica;

public class VehiculoElectrico {
    private String modelo;
    private double capacidadBateria;
    private double nivelActual;

    public VehiculoElectrico(String modelo, double capacidadBateria, double nivelActual) {
        if (capacidadBateria <= 0 || nivelActual < 0 || nivelActual > capacidadBateria) {
            throw new IllegalArgumentException("Valores de batería inválidos.");
        }
        this.modelo = modelo;
        this.capacidadBateria = capacidadBateria;
        this.nivelActual = nivelActual;
    }

    public double recibirCarga(double kw) {
        double espacioLibre = capacidadBateria - nivelActual;
        double aceptado = Math.min(kw, espacioLibre);
        nivelActual += aceptado;
        return aceptado;
    }

    public boolean estaCargado() {
        return nivelActual >= capacidadBateria;
    }

    public double getPorcentaje() {
        return nivelActual / capacidadBateria * 100;
    }

    public String getModelo() {
        return modelo;
    }
}
