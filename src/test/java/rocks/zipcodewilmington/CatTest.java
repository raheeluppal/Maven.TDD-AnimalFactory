package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.theories.internal.ParameterizedAssertionError;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
    @Test
    public void setName() {
        Cat cat1 = new Cat("",new Date(),0);

        String kitty = "Kitty";

        cat1.setName(kitty);

        Assert.assertEquals(kitty, cat1.getName());
    }

    @Test
    public void setBirthDate() {
        Cat cat1 = new Cat("",new Date(),0);

        Date today = new Date();

        cat1.setBirthDate(today);

        Assert.assertEquals(today, cat1.getBirthDate());

    }

    @Test
    public void eat() {
        Cat cat1 = new Cat("",new Date(),0);

        Food tuna = new Food();

        cat1.eat(tuna);

        Integer actual = cat1.getNumberOfMealsEaten();

        Integer expected = 1;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getId() {
        Cat cat1 = new Cat("",new Date(), 0);

        Integer expected = 0;

        Integer actual = cat1.getId();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isAnimalTest(){
        Cat cat1 = new Cat("",new Date(), 0);

        Assert.assertTrue(cat1 instanceof Animal);
    }

    @Test
    public void isMammalTest(){
        Cat cat1 = new Cat("",new Date(), 0);

        Assert.assertTrue(cat1 instanceof Mammal);
    }

}
