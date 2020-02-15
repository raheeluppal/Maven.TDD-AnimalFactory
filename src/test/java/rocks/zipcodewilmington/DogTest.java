package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
    @Test
    public void setBirthDate() {
        Dog dog1 = new Dog("",new Date(),0);

        Date today = new Date();

        dog1.setBirthDate(today);

        Assert.assertEquals(today, dog1.getBirthDate());

    }

    @Test
    public void eat() {
        Dog dog1 = new Dog("",new Date(),0);

        Food tuna = new Food();

        dog1.eat(tuna);

        Integer actual = dog1.getNumberOfMealsEaten();

        Integer expected = 1;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getId() {
        Dog dog1 = new Dog("",new Date(), 0);

        Integer expected = 0;

        Integer actual = dog1.getId();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isAnimalTest(){
        Dog dog1 = new Dog("",new Date(), 0);

        Assert.assertTrue(dog1 instanceof Animal);
    }

    @Test
    public void isMammalTest(){
        Dog dog1 = new Dog("",new Date(), 0);

        Assert.assertTrue(dog1 instanceof Mammal);
    }


}
