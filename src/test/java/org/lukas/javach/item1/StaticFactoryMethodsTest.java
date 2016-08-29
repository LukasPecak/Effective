package org.lukas.javach.item1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Lukas on 29.08.2016.
 * @author Lukas Pecak
 */
public class StaticFactoryMethodsTest {
    @Test
    public void newInstanceIsUniqueInstance() throws Exception {
        StaticFactoryMethods instance1 = StaticFactoryMethods.newInstance();
        StaticFactoryMethods instance2 = StaticFactoryMethods.newInstance();
        assertNotEquals(instance1, instance2);
    }
}