package org.lukas.javach.item1;
/**
 * Created by Lukas on 29.08.2016.
 * @author Lukas Pecak
 */
class StaticFactoryMethods {
    private StaticFactoryMethods() {}

    /**
     *
     * @return Returns always a new instance of class StaticFactoryMethods
     */
    static StaticFactoryMethods newInstance() {
        return new StaticFactoryMethods();
    }
}
