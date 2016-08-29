package org.lukas.javach.item1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Lukas on 29.08.2016.
 * @author Lukas Pecak
 */
public class InstanceControlledStaticFactoryMethodsTest {
    @Test
    public void getInstanceIsTheSameInstanceTest() throws Exception {
        InstanceControlledStaticFactoryMethods instance1 = InstanceControlledStaticFactoryMethods.getInstance();
        InstanceControlledStaticFactoryMethods instance2 = InstanceControlledStaticFactoryMethods.getInstance();
        assertEquals(instance1, instance2);
    }
}