package empresa.vehiculo;

public class Bicicleta extends Vehiculo{

    private int numeroMarchas;

    public Bicicleta(String marca, String modelo, int anio, int numeroMarchas) {
        super(marca, modelo, anio);
        this.numeroMarchas = numeroMarchas;
    }
    @Override
    public void mover() {
        System.out.println("La bicicleta " + marca + " " + modelo + " está pedaleando con " + numeroMarchas + " marchas.");
    }

    @Override
    public String ObtenerDetalles() {
        return super.ObtenerDetalles() + ", Marchas: " + numeroMarchas;
    }
}

