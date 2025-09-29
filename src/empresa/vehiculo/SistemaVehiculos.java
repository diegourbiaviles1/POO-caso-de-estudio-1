package empresa.vehiculo;

public class SistemaVehiculos {
    public static void main(String[] args) {
        //Instancias de vehículos
        Vehiculo auto = new Automovil("Toyota", "Corolla", 2020, 40.0);
        Vehiculo bici = new Bicicleta("Trek", "Mountain", 2022, 21);

        // Prueba para polimorfismo
        auto.mover();
        System.out.println(auto.ObtenerDetalles());
        ((Combustible) auto).recargarCombustible();
        System.out.println("Nivel de combustible: " + ((Combustible) auto).obtenerNivelCombustible());

        bici.mover();
        System.out.println(bici.ObtenerDetalles());

        Vehiculo moto = new Motocicleta("Honda", "CBR", 2023, 500, 5.0);
        moto.mover();
        System.out.println(moto.ObtenerDetalles());
        if (moto instanceof Combustible c) {
            System.out.println("Nivel de combustible (moto): " + c.obtenerNivelCombustible());
            c.recargarCombustible();
            System.out.println("Nivel de combustible (moto) tras recarga: " + c.obtenerNivelCombustible());
        }
        if (auto instanceof Mantenimiento) {
            ((Mantenimiento) auto).realizarMantenimiento();
        }
        if (moto instanceof Mantenimiento) {
            ((Mantenimiento) moto).realizarMantenimiento();
        }
        Vehiculo[] flota = { auto, bici, moto };
        procesarVehiculos(flota);

    }
    public static void procesarVehiculos(Vehiculo[] vehiculos) {
        System.out.println("\n === Procesando vehiculos === ");
        for (Vehiculo v : vehiculos) {
            v.mover();
            System.out.println(v.ObtenerDetalles());

            if (v instanceof Combustible) {
                Combustible c = (Combustible) v;
                System.out.println("   Nivel de combustible (antes): " + String.format("%.2f", c.obtenerNivelCombustible()) + " L");
                c.recargarCombustible();
                System.out.println("   Nivel de combustible (después): " + String.format("%.2f", c.obtenerNivelCombustible()) + " L");
            }
            if (v instanceof Mantenimiento) {
                ((Mantenimiento) v).realizarMantenimiento();
            }
            System.out.println("==============================");
        }
    }

}

