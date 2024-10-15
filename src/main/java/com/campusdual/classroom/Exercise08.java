package com.campusdual.classroom;

import java.util.Scanner;

public class Exercise08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe el numero x: ");
        int num = scanner.nextInt();
        whileLoop(num);



    }

    //TODO ↓
    // Comprueba el funcionamiento del bucle while, que para en cada iteración muestre el siguiente mensaje:
    // X < Y. El próximo ciclo valdrá: X+1
    // X+1 < Y. El próximo ciclo valdrá: X+2
    // etc.
    public static void whileLoop(int num) {
        int x = 0;

        while (num > x) {
            System.out.println(x + " < " + num + ". El proximo ciclo valdra: " + (x + 1));
            x = x + 1;
//num+" < "+n1+". El proximo ciclo valdra: "+(num+1)
        }
    }
}