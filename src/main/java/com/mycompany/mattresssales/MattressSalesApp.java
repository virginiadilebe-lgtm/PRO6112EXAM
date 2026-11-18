package com.mycompany.mattresssales;

import java.util.Scanner;

public class MattressSalesApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] productNames = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
        int[][] sales = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter number of sales for month " + (j + 1) + " for " + productNames[i] + " mattress: ");
                sales[i][j] = input.nextInt();
            }
            System.out.println();
        }
        Products product = new Products(productNames, sales);
        PrintProduct printer = new PrintProduct();
        printer.printReport(product);
        input.close();
    }
}