import java.util.*;

public class Ejercicio10 {
    int[][] matriz;

    public Ejercicio10() {
        matriz = new int[5][5];
    }

    public void execute() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                int random = (int) (Math.random() * 9 - 1);

                matriz[i][j] = random;
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < matriz[0].length; i++) {
            int suma = 0;
            for (int j = 0; j < matriz.length; j++) {
                suma += matriz[i][j];
            }
            System.out.println("| " + suma + " |");
        }

        for (int i = 0; i < matriz[0].length; i++) {
            int suma = 0;
            for (int j = 0; j < matriz.length; j++) {
                suma += matriz[i][j];
            }
            System.out.println("| " + suma + " |");
        }
    }
}
