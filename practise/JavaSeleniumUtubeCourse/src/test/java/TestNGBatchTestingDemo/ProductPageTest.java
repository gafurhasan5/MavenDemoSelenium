package TestNGBatchTestingDemo;

import org.testng.annotations.Test;

public class ProductPageTest {
    @Test
    public  void AddProductToWishList()
    {
        System.out.println("Product Add To Wish List Successfully");
    }
    @Test
    public  void AddProductToCart()
    {
        System.out.println("Add Product to cart Successfully");
    }
    @Test
    public  void SelectQuantity()
    {
        System.out.println("Select Quantity Verify Successfully");
    }
}
