package com.polban.jtk.sales;

public class Main {
    public static void main(String []args){
        // membuat objek produk
        Product product = new Product("Liptint", 45000, 10);
        Sales Penjualan = new Sales (product);

        Penjualan.sellProduct(5);
        Penjualan.restockProduct(1);
        Penjualan.updateProductPrice(12000000);
    }
}
