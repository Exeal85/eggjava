/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hugo
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        int [][] matriz = new int [4][4];
        
        
        System.out.println("============Matriz Original===============");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j]=(int)(Math.random()*10+1);
            }
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println("");
        
        
        System.out.println("============Matriz Transpuesta============");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("["+matriz[j][i]+"]");
            }
            System.out.println("");
        }
        System.out.println("");
        // TODO code application logic here
    }
}
