package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DogTest {

    @Test
    public void speakTest(){
        Dog dog = new Dog("bark!", null);

        String expected = "bark!";

        String actual = dog.speak();

        Assert.assertEquals(expected, actual);
    }
}
