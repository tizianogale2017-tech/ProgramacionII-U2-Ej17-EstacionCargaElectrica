package Ejercicio17_estacionCargaElectrica;

public class SurtidorElectrico {
    private double potenciaKw;

    public SurtidorElectrico(double potenciaKw) {
        this.potenciaKw = potenciaKw;
    }

    public void iniciarCarga(VehiculoElectrico vehiculo, int minutos) {
        System.out.println("Iniciando carga de " + vehiculo.getModelo() + " a " + potenciaKw + " kW.");
        double energiaPorMinuto = potenciaKw / 60;
        for (int minuto = 1; minuto <= minutos; minuto++) {
            if (vehiculo.estaCargado()) {
                System.out.println("Batería al 100%: la carga se detiene automáticamente en el minuto " + (minuto - 1) + ".");
                return;
            }
            vehiculo.recibirCarga(energiaPorMinuto);
            if (minuto % 15 == 0) {
                System.out.printf("Minuto %d: batería al %.1f%%%n", minuto, vehiculo.getPorcentaje());
            }
        }
        System.out.printf("Fin de la sesión (%d min): batería al %.1f%%%n", minutos, vehiculo.getPorcentaje());
    }
}
