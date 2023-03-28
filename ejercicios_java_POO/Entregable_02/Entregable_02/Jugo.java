public class Main{
    public static void main(String[] args)
    {
        //Objeto
        Jugo jugo = new Jugo("Jugo de naranja", 2500, 3);
        int cantidadJugos = 10;
        double costoTotal = jugo.calcularCosto(cantidadJugos);
        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
        System.out.println("El costo total de " + cantidadJugos + " jugos de " + jugo.getNombre() + " es: $" + costoTotal);
        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
    }
}
// Declaración de clase jugo y metodos
public class Jugo {
    private String nombre;
    private double precio;
    private int cantidadFruta;

    public Jugo(String nombre, double precio, int cantidadFruta) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadFruta = cantidadFruta;
    }
    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public int getCantidadFruta() {
        return cantidadFruta;
    }
    public double calcularCosto(int cantidadJugos) {
        return precio * cantidadJugos;
    }
}
