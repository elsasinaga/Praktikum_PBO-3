import com.polban.jtk.sales.Product; //test
import com.polban.jtk.sales.Sales;

public class MainProgram {
    public static void main(String []args){
        // membuat objek produk
        Product product = new Product("Liptint", 45000, 10);
        Sales Penjualan = new Sales (product);

        Penjualan.sellProduct(5);
        Penjualan.restockProduct(1);
        Penjualan.updateProductPrice(12000000);
    }
}
