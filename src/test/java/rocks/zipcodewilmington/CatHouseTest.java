package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void addCatTest() {
        Cat cat1 = new Cat("", new Date(), 0);

        CatHouse.add(cat1);

        Integer actual = 1;

        Integer expected = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void removeCatIdTest() {

        CatHouse.clear();

        Cat cat1 = new Cat("", new Date(), 1);

        CatHouse.add(cat1);

        CatHouse.remove(1);

        Integer actual = 0;

        Integer expected = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void removeCatByCatTest() {

        CatHouse.clear();

        Cat cat1 = new Cat("", new Date(), 0);

        CatHouse.add(cat1);

        CatHouse.remove(cat1);

        Integer actual = 0;

        Integer expected = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getCatByIdTest() {

        CatHouse.clear();

        Cat cat1 = new Cat("", new Date(), 0);

        CatHouse.add(cat1);

        Cat expected = CatHouse.getCatById(0);

        Cat actual = cat1;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfCats() {

        CatHouse.clear();

        Cat cat1 = new Cat("", new Date(), 0);

        CatHouse.add(cat1);

        Integer expected = CatHouse.getNumberOfCats();

        Integer actual = 1;

        Assert.assertEquals(expected, actual);

    }
}