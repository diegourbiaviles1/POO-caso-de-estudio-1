package empresa.vehiculo;

public class Automovil extends Vehiculo implements Combustible, Mantenimiento {

    private double nivelCombustible;

    public Automovil(String marca, String modelo, int anio, double nivelCombustible) {
        super(marca, modelo, anio);
        this.nivelCombustible = nivelCombustible;
    }
    @Override
    public void mover()  {
        if (nivelCombustible > 0) {
            System.out.println("El automóvil " + marca + " " + modelo + " está conduciendo.");
            nivelCombustible -= 0.5;
            if (nivelCombustible < 0) nivelCombustible = 0;
        } else {
            System.out.println("El automóvil " + marca + " " + modelo + " no tiene combustible.");
        }
    }

    @Override
    public String ObtenerDetalles() {
        return super.ObtenerDetalles() + ", Combustible: " + nivelCombustible + " litros";
    }


    @Override
    public void recargarCombustible() {
        nivelCombustible = 50.0;
        System.out.println("El automóvil " + marca + " " + modelo + " ha sido recargado con combustible.");
    }

    @Override
    public double obtenerNivelCombustible() {
        return nivelCombustible;
    }

    @Override
    public void realizarMantenimiento() {
        System.out.println("Revisando motor y frenos del automóvil " + marca + " " + modelo + ".");
    }
}
