package semana_12;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cisne
 */
import java.util.Scanner;

public class ReservaCine {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] asientos = new int[3][4];
        int a, b;
        System.out.println("Ingrese fila (0 a 2): ");
        a = teclado.nextInt();
        System.out.println("Ingrese columna (0 a 3): ");
        b = teclado.nextInt();
        asientos[a][b] = 1;
        System.out.println("Estado de la sala:");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.print(asientos[i][j] + " ");
            }
            System.out.println();
        }
    }
}