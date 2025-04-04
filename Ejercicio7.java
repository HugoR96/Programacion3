import java.util.Scanner;

public class Ejercicio7 {
    int vector1[];
    int vector2[];
    int vector3[];
    Scanner scanner;

    public Ejercicio7(){
        vector1=new int[5];
        vector2=new int[5];
        vector3=new int[5];

        scanner=new Scanner(System.in);
    }
    public void ejecutar(){
        for (int i = 0; i < vector1.length ; i++) {
            System.out.println("Vector1["+i+"]:");
            int numero1=scanner.nextInt();
            vector1[i]=numero1;

            System.out.println("Vector2["+i+"]:");
            int numero2=scanner.nextInt();
            vector2[i]=numero2;

            System.out.println("Vector3["+i+"]:");
            int numero3=scanner.nextInt();
            vector3[i]=numero3;

        }
    }
}
