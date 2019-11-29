import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class SneakerServiceTest {
    @Test
    public void createTest(){

        // (1) given
        String expectedName = "Eddie";
        String expectedBrand = "Nike";
        String expectedSport = "basketball";
        int expectedSize = 11;
        int expectedQty = 1000;
        float expectedPrice = 80.00f;

        // (2)
        SneakerService sneakerService = new SneakerService();
        Sneaker testSneaker = sneakerService.create(expectedName, expectedBrand,
                expectedSport, expectedSize, expectedQty, expectedPrice);

        // (3) when
        int actualId = testSneaker.getId();
        String actualName = testSneaker.getName();
        String actualBrand = testSneaker.getBrand();
        String actualSport = testSneaker.getSport();
        int actualSize = testSneaker.getSize();
        int actualQty = testSneaker.getQty();
        float actualPrice = testSneaker.getPrice();

        // (4) then
        assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        assertEquals(expectedName, actualName);
        assertEquals(expectedBrand, actualBrand);
        assertEquals(expectedSize, actualSize);
        assertEquals(expectedQty, actualQty);
        assertEquals(expectedPrice, actualPrice, 80.00f);
        assertEquals(expectedSport,actualSport);
    }

    public void testFindSneaker(){
        // given
        String expectedName = "Eddie";
        String expectedBrand = "Nike";
        String expectedSport = "basketball";
        int expectedSize = 11;
        int expectedQty = 1000;
        float expectedPrice = 80.00f;
        SneakerService sneakerService = new SneakerService();

        //when
        Sneaker testSneaker = sneakerService.create(expectedName, expectedBrand,
                expectedSport, expectedSize, expectedQty, expectedPrice);
        Sneaker actual = sneakerService.findSneaker(1);
        //then
        assertEquals(actual, testSneaker);
    }

    public void testFindAll(){

    }

    public void testDelete(){
        //given
        String expectedName = "Eddie";
        String expectedBrand = "Nike";
        String expectedSport = "basketball";
        int expectedSize = 11;
        int expectedQty = 1000;
        float expectedPrice = 80.00f;
        //when
        SneakerService sneakerService = new SneakerService();
        sneakerService.create(expectedName, expectedBrand,
                expectedSport, expectedSize, expectedQty, expectedPrice);
        //then
        assertTrue(sneakerService.delete(1));
    }
}
