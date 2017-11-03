package org.kucro3.kraitsorm.key.impl;

import org.kucro3.kraitsorm.key.Key;
import org.kucro3.kraitsorm.key.KeyGen;

public class SimpleKeyGen implements KeyGen {
    private SimpleKeyGen()
    {
    }

    @Override
    public Key from(Object... args)
    {
        return new SimpleKey(args);
    }

    public static final SimpleKeyGen INSTANCE = new SimpleKeyGen();
}
