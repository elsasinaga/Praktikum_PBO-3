package com.polban.jtk.sales;
// kelas produk
public class Product {
    // Atribute private untuk menyembunyikan informasi
    private String productName;
    private double price;
    private int stock;

    //constructor
    public Product (String productName, double price, int stock){
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

    //getter dan setter untuk mengontrol akse atribut private
    public String getProductName(){
        return productName;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice (double price){
        if (price > 0) {
            this.price = price;
        }else{
            System.out.println("Harga tidak valid!");
        }
    }

    public int getStock() {
        return stock;
    }

    public void addStock(int amount){
        if (amount > 0) {
            this.stock += amount;
        }else{
            System.out.println("jumlah stok tidak valid");
        }
    }

    public void sellProduct(int quantity) {
        if (quantity > 0 && quantity <= stock ){
            stock -= quantity;
            System.out.println(quantity + " " + productName + " terjual");
        }else {
            System.out.println("Jumlah stok tidak cukup untuk penjualan");
        }
    }
}
