package empresa.vehiculo;

public class Motocicleta extends Vehiculo implements Combustible, Mantenimiento {
    private int cilindrada;
    private double nivelCombustible;
    private static final double CAPACIDAD_TANQUE = 20.0;

    public Motocicleta(String marca, String modelo, int anio, int cilindrada, double nivelInicial) {
        super(marca, modelo, anio);
        this.cilindrada = cilindrada;
        this.nivelCombustible = Math.max(0, Math.min(nivelInicial, CAPACIDAD_TANQUE));
    }
    @Override
    public void mover() {
        if (nivelCombustible > 0) {
            System.out.println("La motocicleta " + marca + " " + modelo + " está acelerando con " + cilindrada + " cc.");
            nivelCombustible -= 0.3;
            if (nivelCombustible < 0) nivelCombustible = 0;
        } else {
            System.out.println("La motocicleta " + marca + " " + modelo + " no tiene combustible.");
        }
    }
    @Override
    public String ObtenerDetalles() {
        return super.ObtenerDetalles()
                + ", Cilindrada: " + cilindrada + " cc"
                + ", Combustible: " + String.format("%.2f", nivelCombustible) + " litros";
    }

    @Override
    public void recargarCombustible() {
        nivelCombustible = CAPACIDAD_TANQUE;
        System.out.println("La motocicleta " + marca + " " + modelo + " ha sido recargada a " + CAPACIDAD_TANQUE + " litros.");
    }

    @Override
    public double obtenerNivelCombustible() {
        return nivelCombustible;
    }

    @Override
    public void realizarMantenimiento() {
        System.out.println("Cambiando aceite y ajustando cadena de la motocicleta " + marca + " " + modelo + ".");
    }
}
