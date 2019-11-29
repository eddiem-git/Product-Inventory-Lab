import org.junit.Assert;
import org.junit.Test;

public class testSneaker {
    @Test
    public void SneakerTest() {
        //given
        String expectedName = "Eddie";
        String expectedBrand = "Nike";
        String expectedSport =  "basketball";
        int expectedId = 2552;
        int expectedSize = 11;
        int expectedQuantity = 1000;
        float expectedPrice = 80.00f;
        Sneaker sneaker = new Sneaker();

        //when
        sneaker.setBrand(expectedBrand);
        sneaker.setId(expectedId);
        sneaker.setName(expectedName);
        sneaker.setQty(expectedQuantity);
        sneaker.setSize(expectedSize);
        sneaker.setSport(expectedSport);
        sneaker.setPrice(expectedPrice);

        //then
        Assert.assertEquals(expectedBrand,sneaker.getBrand());
        Assert.assertEquals(expectedId, sneaker.getId());
        Assert.assertEquals(expectedName, sneaker.getName());
        Assert.assertEquals(expectedQuantity, sneaker.getQty());
        Assert.assertEquals(expectedSize, sneaker.getSize());
        Assert.assertEquals(expectedSport,sneaker.getSport());
        Assert.assertEquals(expectedPrice,sneaker.getPrice(), 80.00f);
    }

    @Test
    public void setNameTest() {
        // given (1)
        String expected = "OZWEEGO";
        Sneaker sneaker = new Sneaker();

        // when (2)
        sneaker.setName(expected);

        // then (3)
        Assert.assertEquals(expected, sneaker.getName());
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
    public void setSportTest() {
        // given (1)
        String expected = "basketball";
        Sneaker sneaker = new Sneaker();

        // when (2)
        sneaker.setSport(expected);

        // then (3)
        Assert.assertEquals(expected, sneaker.getSport());
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
