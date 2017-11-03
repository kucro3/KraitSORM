package org.kucro3.kraitsorm.key;

import org.kucro3.kraitsorm.key.impl.SimpleKeyGen;

public interface KeyGen {
    public Key from(Object... args);

    public static KeyGen unsafe()
    {
        return SimpleKeyGen.INSTANCE;
    }
}
