package org.kucro3.kraitsorm.key;

import java.util.Optional;

public interface Key {
    @Override
    public boolean equals(Object object);

    @Override public int hashCode();

    public int getQuantity();

    public <T> T getElement(int index);

    public <T> Optional<T> getElementSafely(int index);

    public static boolean equals(Key key, Object object)
    {
        if(object == null)
            return false;

        if(object.hashCode() != key.hashCode())
            return false;

        if(!(object instanceof Key))

            return false;

        Key obj = (Key) object;

        if(obj.getQuantity() != key.getQuantity())
            return false;

        for(int i = 0; i < obj.getQuantity(); i++)
            if(!obj.getElement(i).equals(key.getElement(i)))
                return false;

        return true;
    }
}
