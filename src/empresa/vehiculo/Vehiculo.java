package empresa.vehiculo;

public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int anio;

    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }
    public abstract void mover();

    public String ObtenerDetalles(){
        return "Marca:"+ marca + ",Modelo:"+modelo+",Año:"+anio;
    }
}
