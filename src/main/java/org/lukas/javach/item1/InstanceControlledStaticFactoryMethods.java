package org.lukas.javach.item1;

/**
 * Created by Lukas on 29.08.2016.
 * @author Lukas Pecak
 */
class InstanceControlledStaticFactoryMethods {
    private static InstanceControlledStaticFactoryMethods instance;

    private InstanceControlledStaticFactoryMethods() {}

    /**
     *
     * @return Returns always the same instance of class InstanceControlledStaticFactoryMethods
     */
    static InstanceControlledStaticFactoryMethods getInstance() {
        if (instance == null) {
            instance = new InstanceControlledStaticFactoryMethods();
        }
        return instance;
    }
}
