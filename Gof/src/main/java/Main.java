/*
*Iniciamos el proceso que va a consumir nuestra instancia unica
*/
public class Main {
    public static void main(String[] args) {
        /*
        *Creamos el primer hilo que va a recorrer el proceso y consumir la instancia
        */
        Thread t1 = new Thread(new Runnable (){
            @Override
            public void run(){
                Estudiantes estudiante1 = Estudiantes.getEstudiantes();
                System.err.println(estudiante1.hashCode());
            }
        });
        /*
        *Acá inicia el segundo hilo que recorrera nuestra instancia
        */
        Thread t2 = new Thread(new Runnable (){
            @Override
            public void run(){
                Estudiantes estudiante2 = Estudiantes.getEstudiantes();
                System.err.println(estudiante2.hashCode());
            }
        });
        /*
        *Para poder comprobar que no solo estan consumiendo la misma instancia, sino que ademas 
        *esta sincronizada y los 2 hilos no ejecutan el proceso sin control, imprimimos el "hasCode"
        *
        *Realizando elte proceso sin "synchronized" ocasiona que el hashCode generado sea distinto
        *al tener 2 llamadas simultaneas
        */
        
        /*
        *Damos inicio a los hilos
        */
        t1.start();
        t2.start();
    }
    
}
