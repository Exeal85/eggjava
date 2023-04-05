
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hugo
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector:");
        int N = leer.nextInt();
        int contador = 0;
        int[] vector = new int[N];

        for (int i = 0; i < N; i++) {
            vector[i] = (int) (Math.random() * 10 + 1);
        }

        for (int i = 0; i < N; i++) {
            System.out.print(vector[i] + " ");
        }

        System.out.println("Ingrese el número que desea buscar:");
        int num = leer.nextInt();

        for (int i = 0; i < N; i++) {
            if (vector[i] == num) {
                contador++;
                System.out.println("El número se encuentra en el indice: " + i);
            }

            if (contador > 1) {
                System.out.println("El número se encuentra repetido " + contador + " veces.");
            }  // TODO code application logic here
        }
    }
}
