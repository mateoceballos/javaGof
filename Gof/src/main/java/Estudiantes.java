/*
La clase estudiantes define el metodo "getEstudiantes", lo que ocaciona que el usuario
pueda entrar unicamente a esta instancia
*/
public class Estudiantes {

    
    private static Estudiantes eEstudiantes;
    /*
    *El constructor debe encontrarse siempre privado, esto con el fin de prevenir
    *llamados directos al constructor con el operaor "new"
    */
    private Estudiantes (){}
    /*
    *Este es el metodo estatico el cual previene el acceso a la instancia "estudiantes"
    *
    *Esta implementación nos deja hacer una Subclase en la clase estudiante mientras mantiene una 
    *sola instancia de cada subclase, en este caso es importante tener "synchronized"
    *esto nos ayuda a obligar el consumo de esta instancia en orden, es decir, si vienen 2 hilos
    *hasta que el primero no termine su proceso, no inicia el del siguiente hilo
    */
    public synchronized static Estudiantes getEstudiantes(){
        if (eEstudiantes == null) {
            eEstudiantes = new Estudiantes();
        }
        return eEstudiantes;
    }
}
