import org.junit.Assert;
import org.junit.Test;

public class testSandals {

    @Test
    public void SandalsTest() {
        //given
        String expectedName = "Eddie";
        String expectedBrand = "Nike";
        int expectedId = 2552;
        int expectedSize = 11;
        int expectedQuantity = 1000;
        Sandals sandals = new Sandals();

        //when
        sandals.setBrand(expectedBrand);
        sandals.setId(expectedId);
        sandals.setName(expectedName);
        sandals.setQty(expectedQuantity);
        sandals.setSize(expectedSize);

        //then
        Assert.assertEquals(expectedBrand,sandals.getBrand());
        Assert.assertEquals(expectedId, sandals.getId());
        Assert.assertEquals(expectedName, sandals.getName());
        Assert.assertEquals(expectedQuantity, sandals.getQty());
        Assert.assertEquals(expectedSize, sandals.getSize());

    }
    @Test
    public void setNameTest() {
        // given (1)
        String expected = "Nike";
        Sandals sandals = new Sandals();

        // when (2)
        sandals.setName(expected);

        // then (3)
        Assert.assertEquals(expected, sandals.getName());
    }
    @Test
    public void setBrandTest() {
        // given (1)
        String expected = "Nike";
        Sneaker sneaker = new Sneaker();

        // when (2)
        sneaker.setBrand(expected);

        // then (3)
        Assert.assertEquals(expected, sneaker.getBrand());
    }

    @Test
    public void setIdTest() {
        // given (1)
        int expected = 2552;
        Sneaker sneaker = new Sneaker();

        // when (2)
        sneaker.setId(expected);

        // then (3)
        Assert.assertEquals(expected, sneaker.getId());
    }
    @Test
    public void setSizeTest() {
        // given (1)
        int expected = 11;
        Sneaker sneaker = new Sneaker();

        // when (2)
        sneaker.setSize(expected);

        // then (3)
        Assert.assertEquals(expected, sneaker.getSize());
    }
    @Test
    public void setQuantityTest() {
        // given (1)
        int expected = 2552;
        Sneaker sneaker = new Sneaker();

        // when (2)
        sneaker.setQty(expected);

        // then (3)
        Assert.assertEquals(expected, sneaker.getQty());
    }
}
