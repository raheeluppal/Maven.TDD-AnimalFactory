package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test

    public void createDogTest(){

        Date today = new Date();

        Dog dog1 = AnimalFactory.createDog("Skip", today);

        String expected = "Skip";

        String actual = dog1.getName();

        Assert.assertEquals(expected, actual);

    }

    @Test

    public void createCatTest(){

        Date today = new Date();

        Cat cat1 = AnimalFactory.createCat("Skip", today);

        String expected = "Skip";

        String actual = cat1.getName();

        Assert.assertEquals(expected, actual);

    }
}
