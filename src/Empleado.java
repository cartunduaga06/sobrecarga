public class Empleado{
    private   String nombre;
    private   String legajo;
    protected double sueldo;
    protected double descuentos;

    public Empleado(String nombre, String legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.sueldo = 500.000;
        this.descuentos = 10.000;
    }



    public double calcularSueldo(){
        return sueldo - descuentos;
    }
    public double calcularSueldo(double premio){
        return sueldo - descuentos + premio;
    }
}

