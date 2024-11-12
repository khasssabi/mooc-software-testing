package tudelft.discount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;
import static org.mockito.Mockito.when;

public class DiscountApplierTest {

    private ProductDao productDao;
    private DiscountApplier discountApplier;

    @BeforeEach
    public void setup() {
        productDao = Mockito.mock(ProductDao.class);
        discountApplier = new DiscountApplier(productDao);
    }

    @Test
    public void applyDiscount() {

        List<Product> products = List.of(
                new Product("Blanket", 80, "HOME"),
                new Product("WaterCooler", 150, "BUSINESS"),
                new Product("Candle", 1, "HOME"),
                new Product("Chair", 350, "BUSINESS"),
                new Product("Pencil", 0.9, "BUSINESS"),
                new Product("Napkins", 0.8, "HOME"),
                new Product("Tent", 180, "OUTDOOR")
        );
        when(productDao.all()).thenReturn(products);

        discountApplier.setNewPrices();

        Assertions.assertEquals(72, products.get(0).getPrice(), 0.01);
        Assertions.assertEquals(165, products.get(1).getPrice(), 0.01);
        Assertions.assertEquals(0.9, products.get(2).getPrice(), 0.01);
        Assertions.assertEquals(385, products.get(3).getPrice(), 0.01);
        Assertions.assertEquals(0.99, products.get(4).getPrice(), 0.01);
        Assertions.assertEquals(0.72, products.get(5).getPrice(), 0.01);
        Assertions.assertEquals(180, products.get(6).getPrice(), 0.01);

    }
}
