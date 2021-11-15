public class Vendedor extends Empleado{
    public Vendedor(String nombre, String legajo, int comision, double importeVentas) {
        super(nombre, legajo);
        this.comision = comision;
        this.importeVentas = importeVentas;
    }

    private int comision;
    private double importeVentas;

    @Override
    public double calcularSueldo(){
        return sueldo-descuentos + importeVentas/100*comision;
    }
    @Override
    public double calcularSueldo(double premio){
        return sueldo-descuentos + premio+ importeVentas/100*comision;
    }
}
