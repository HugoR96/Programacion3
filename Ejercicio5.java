public class Ejercicio5 {
    int vector[];

    public Ejercicio5() {
        vector = new int[10];

    }

    public void ejecutar() {
        for (int i = 0; i < vector.length; i++) {
            int aleaorio = (int) (Math.random() * 100 + 1);

            vector[i] = aleaorio;
        }
        System.out.println("Vector antes del ordenamiento:");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("vector["+i+"]:"+vector [i]);
            
        }
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = 0; j < vector.length - 1 - i; j++) {
                if (vector[j] > vector[j + 1]) {
                 int auxiliar = vector[j];
                 vector[j]=vector [j+1];
                 vector[j+1]=auxiliar;

                }
            }
        }
        System.out.println("Vector despues del ordenamiento:");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("vector["+i+"]:"+vector [i]);
        }
    }
}
