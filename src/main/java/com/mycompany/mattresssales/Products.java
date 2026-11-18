package com.mycompany.mattresssales;

public class Products implements IProducts {
    private String[] productNames;
    private int[][] sales;

    public Products(String[] productNames, int[][] sales) {
        this.productNames = productNames;
        this.sales = sales;
    }

    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }
        }
        return total;
    }

    @Override
    public double GetAverageProductsSold() {
        return (double) GetTotalProductsSold() / (sales.length * sales[0].length);
    }

    @Override
    public String GetMostPopularProduct() {
        int best = 0;
        int bestTotal = -1;
        for (int i = 0; i < sales.length; i++) {
            int t = 0;
            for (int j = 0; j < sales[i].length; j++) {
                t += sales[i][j];
            }
            if (t > bestTotal) {
                bestTotal = t;
                best = i;
            }
        }
        int bestMonth = 0;
        for (int j = 0; j < sales[best].length; j++) {
            if (sales[best][j] > bestMonth) {
                bestMonth = sales[best][j];
            }
        }
        return productNames[best] + "(" + bestMonth + ")";
    }
}