package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class BirdTest {
    @Test
    public void speakTest(){
        Bird bird = new Bird("tweet!", null);

        String expected = "tweet!";

        String actual = bird.speak();

        Assert.assertEquals(expected, actual);
    }
}
