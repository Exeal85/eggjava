/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hugo
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];

        System.out.println("============Matriz Original===============");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int) (Math.random() * 10 + 1);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("");

        System.out.println("============Matriz Transpuesta============");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[j][i] + "]");
            }
            System.out.println("");
        }
        System.out.println("");

        Scanner leer = new Scanner(System.in);
        matriz = new int[3][3];
        int cont;

        System.out.println("============Matriz Original===============");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("valor del incice [" + i + "," + j + "]");
                matriz[i][j] = leer.nextInt();
            }
        }

        System.out.println("");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("==========================================");

        System.out.println("============Matriz Transpuesta============");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[j][i] + "]");
            }
            System.out.println("");
        }
        System.out.println("==========================================");

        cont = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] + matriz[j][i] == 0) {
                    cont++;
                }
            }
        }

        if (cont == 9) {
            System.out.println("La matriz es antisimetrica");
        } else {
            System.out.println("La matrzi no es antisimetrica");
        }
        // TODO code application logic here
    }

}
