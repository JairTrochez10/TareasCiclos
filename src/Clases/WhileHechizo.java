package Clases;

public class WhileHechizo {

    int inicio;
    int fin;
    int paso;

    public WhileHechizo(int in, int fi, int pa) {
        inicio = in;
        fin = fi;
        paso = pa;
    }

    public void whileHechizo() {
        // condición para parar
        if ((paso > 0 && inicio > fin) || (paso < 0 && inicio < fin)) {
            System.out.println("Ciclo Terminado");
            return;
        }

        // Accion
        System.out.println(inicio);

        // Avanzar
        inicio = inicio + paso;

        // Llamada recursiva
        whileHechizo();
    }
}
