public class Estudiante {

    String nombre;
    int edad;
    double promedio;

    // Constructor
    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre =nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);
    }

    // Método para verificar si aprobó
    public void verificarAprobacion() {
        if (promedio >= 70) {
            System.out.println(nombre + " ha aprobado.");
        } else {
            System.out.println(nombre + " ha reprobado");
        }
    }
}