package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
    @Test
    public void addDogTest() {
        Dog dog1 = new Dog("", new Date(), 0);

        DogHouse.add(dog1);

        Integer actual = 1;

        Integer expected = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void removeDogIdTest() {

        DogHouse.clear();

        Dog dog1 = new Dog("", new Date(), 0);

        DogHouse.add(dog1);

        DogHouse.remove(0);

        Integer actual = 0;

        Integer expected = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void removeDogsbyDogTest() {

        DogHouse.clear();

        Dog dog1 = new Dog("", new Date(), 0);

        DogHouse.add(dog1);

        DogHouse.remove(dog1);

        Integer actual = 0;

        Integer expected = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getDogsByIdTest() {

        DogHouse.clear();

        Dog dog1 = new Dog("", new Date(), 0);

        DogHouse.add(dog1);

        Dog expected = DogHouse.getDogById(0);

        Dog actual = dog1;

        Assert.assertEquals(expected, actual);
    }

}
