package com.elyeproj.autovalue;

import org.junit.Test;

import static com.elyeproj.autovalue.MyComponent.createMyKey;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void testAnimal() {
        Animal dog = Animal.create("dog", 4);
        assertEquals("dog", dog.name());
        assertEquals(4, dog.numberOfLegs());

        // You probably don't need to write assertions like these; just illustrating.
        assertTrue(Animal.create("dog", 4).equals(dog));
        assertFalse(Animal.create("cat", 4).equals(dog));
        assertFalse(Animal.create("dog", 2).equals(dog));

        assertEquals("Animal{name=dog, numberOfLegs=4}", dog.toString());
    }

    @Test
    public void testAutoAnnotation() {
        MyKey key = createMyKey("abc", Animal.class, new int[] {1, 5, 10});

        System.out.println(key);
    }
}