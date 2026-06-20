public class Principal {
    
    public static void main(String[] args) {

        // Crear objetos (instanciación)
        Estudiante estudiante1 = new Estudiante("Juan", 20, 85);
        Estudiante estudiante2 = new Estudiante("María", 19, 65);

        // Usar métodos
        estudiante1.mostrarInformacion();
        estudiante2.verificarAprobacion();

        System.out.println("-----------");

        estudiante2.mostrarInformacion();
        estudiante2.verificarAprobacion();
    }
}
