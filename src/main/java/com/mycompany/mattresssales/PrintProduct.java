package com.mycompany.mattresssales;

public class PrintProduct {
    public void printReport(Products product) {
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("******************************");
        System.out.println("TOTAL PRODUCT SALES: " + product.GetTotalProductsSold());
        System.out.println("AVERAGE PRODUCT SALES: " + (int) product.GetAverageProductsSold());
        System.out.println("MOST POPULAR PRODUCT: " + product.GetMostPopularProduct());
    }
}