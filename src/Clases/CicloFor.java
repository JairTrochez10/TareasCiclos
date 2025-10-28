package Clases;

public class CicloFor {
    int inicio;
    int fin;
    int incre;

    public CicloFor(int in, int fi, int inc) {
        inicio = in;
        fin = fi;
        incre = inc;
    }

    public void forHechizo() {
        // condicion para detener
        if (fin <= inicio) {
            System.out.println("Ciclo Terminado");
            return;
        }

        // imprime el valor actual
        System.out.println(inicio);

        // avanza
        inicio = inicio + incre;

        // llamada recursiva
        forHechizo();
    }
}
