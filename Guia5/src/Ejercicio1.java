/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hugo
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        int[] enteros = new int[100];
        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = i + 1;
        }
        for (int i = enteros.length - 1; i >= 0; i--) {
            System.out.println(enteros[i]);
        }

    }
}
