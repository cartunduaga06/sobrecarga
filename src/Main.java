public class Main {

    public static void main(String[] args) {

        Empleado miEmpleado = new Empleado("Juan", "1111");
        System.out.println("Sueldo a cobrar: " + miEmpleado.calcularSueldo());
        System.out.println("Sueldo a cobrar: " + miEmpleado.calcularSueldo(5000));

        Empleado miVendedor =  new Vendedor("carlos","222",2,2.5);

        System.out.println(miVendedor.calcularSueldo());
        System.out.println(miVendedor.calcularSueldo(50));
    }
}
