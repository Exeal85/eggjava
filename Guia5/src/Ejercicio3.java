/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class Ejercicio3 {
public static void main(String[] args) {Scanner leer = new Scanner(System.in);
        int tamano, cont, cont2, cont3, cont4, cont5;

        System.out.println("Ingrese el tamaño del vector");
        tamano = leer.nextInt();

        int[] v = new int[tamano];

        for (int i = 0; i < tamano; i++) {
            v[i] = (int) (Math.random() * 100000 + 1);
        }

        for (int i = 0; i < tamano; i++) {
            System.out.print("[" + v[i] + "]");
        }

        cont = 0;
        cont2 = 0;
        cont3 = 0;
        cont4 = 0;
        cont5 = 0;
        for (int i = 0; i < tamano; i++) {
            if (v[i] > 0 && v[i] < 10) {
                cont++;
            } else if (v[i] >= 10 && v[i] < 100) {
                cont2++;
            } else if (v[i] >= 100 && v[i] < 1000) {
                cont3++;
            } else if (v[i] >= 1000 && v[i] < 10000) {
                cont4++;
            } else if (v[i] >= 10000 && v[i] < 100000) {
                cont5++;
            }
        }
        
        System.out.println("Numeros de un digito: "+cont);
        System.out.println("Numeros de dos digitos: "+cont2);
        System.out.println("Numeros de tres digitos: "+cont3);
        System.out.println("Numeros de cuatro digitos: "+cont4);
        System.out.println("Numeros de cinco digitos: "+cont5);
        
}
}