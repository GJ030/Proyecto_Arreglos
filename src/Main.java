import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[20];
        int[] cuadrados = new int[20];
        int[] cubo = new int[20];


        for (int i = 0; i < numeros.length; i++) {

            System.out.println("Ingrese el valor " + i + " del arreglo:");
            int valor = scanner.nextInt();
            numeros[i] = valor;
        }

        for (int i = 0; i < numeros.length; i++) {
            cuadrados[i] = numeros[i] * numeros[i];

        }

        for (int i = 0; i < numeros.length; i++) {
            cubo[i] = numeros[i] * numeros[i] * numeros[i];

        }

        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(cuadrados));
        System.out.println(Arrays.toString(cubo));
        }

    }

