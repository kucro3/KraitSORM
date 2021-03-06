package org.kucro3.kraitsorm.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Adapter method form: public static TYPE methodname(Datum data) {...};
 *                      public static Datum methodname(TYPE object) {...};
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Adapter {
    public Class<?> type();
}
