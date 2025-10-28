import Clases.CicloFor;
import Clases.WhileHechizo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ========================
        // MENU PRINCIPAL
        // ========================
        System.out.println("===== MENU HECHIZOS =====");
        System.out.println("1) Usar CicloFor (forHechizo)");
        System.out.println("2) Usar WhileHechizo (whileHechizo)");
        System.out.print("Elige una opcion: ");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            // ------------------------
            // CicloFor
            // ------------------------
            System.out.println("\n--- CICLO FOR HECHIZO ---");
            System.out.println("1) Contar del 1 al 5");
            System.out.println("2) Pares del 2 al 10");
            System.out.println("3) Impares del 1 al 9");
            System.out.println("4) Multiplos de 5 (5 a 25)");
            System.out.println("5) De 10 en 10 (10 a 100)");
            System.out.print("Elige el ejercicio: ");
            int sub = sc.nextInt();

            switch (sub) {
                case 1:
                    System.out.println("\nEJERCICIO: Contar del 1 al 5");
                    CicloFor ej1 = new CicloFor(1, 6, 1);
                    ej1.forHechizo();
                    break;

                case 2:
                    System.out.println("\nEJERCICIO: Pares del 2 al 10");
                    CicloFor ej2 = new CicloFor(2, 12, 2);
                    ej2.forHechizo();
                    break;

                case 3:
                    System.out.println("\nEJERCICIO: Impares del 1 al 9");
                    CicloFor ej3 = new CicloFor(1, 11, 2);
                    ej3.forHechizo();
                    break;

                case 4:
                    System.out.println("\nEJERCICIO: Multiplos de 5 (5 a 25)");
                    CicloFor ej4 = new CicloFor(5, 30, 5);
                    ej4.forHechizo();
                    break;

                case 5:
                    System.out.println("\nEJERCICIO: De 10 en 10 hasta 100");
                    CicloFor ej5 = new CicloFor(10, 110, 10);
                    ej5.forHechizo();
                    break;
                default:
                    System.out.println("Opcion no valida en CicloFor");
            }

        } else if (opcion == 2) {
            // ------------------------
            // WhileHechizo
            // ------------------------
            System.out.println("\n--- WHILE HECHIZO ---");
            System.out.println("1) Contar del 1 al 5");
            System.out.println("2) Contar hacia abajo (10 a 1)");
            System.out.println("3) Pares del 2 al 10");
            System.out.println("4) Impares del 1 al 9");
            System.out.println("5) Multiplos de 5 (5 a 25)");
            System.out.print("Elige el ejercicio: ");
            int sub = sc.nextInt();

            switch (sub) {
                case 1:
                    System.out.println("\nEJERCICIO: Contar del 1 al 5");
                    WhileHechizo w1 = new WhileHechizo(1, 5, 1);
                    w1.whileHechizo();
                    break;

                case 2:
                    System.out.println("\nEJERCICIO: Contar de 10 a 1");
                    WhileHechizo w2 = new WhileHechizo(10, 1, -1);
                    w2.whileHechizo();
                    break;

                case 3:
                    System.out.println("\nEJERCICIO: Pares del 2 al 10");
                    WhileHechizo w3 = new WhileHechizo(2, 10, 2);
                    w3.whileHechizo();
                    break;

                case 4:
                    System.out.println("\nEJERCICIO: Impares del 1 al 9");
                    WhileHechizo w4 = new WhileHechizo(1, 9, 2);
                    w4.whileHechizo();
                    break;

                case 5:
                    System.out.println("\nEJERCICIO: Multiplos de 5 (5 a 25)");
                    WhileHechizo w5 = new WhileHechizo(5, 25, 5);
                    w5.whileHechizo();
                    break;
                default:
                    System.out.println("Opcion no valida en WhileHechizo.");
            }
        } else {
            System.out.println("Opcion no valida en el menu principal.");
        }
        sc.close();
    }
}
