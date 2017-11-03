package org.kucro3.kraitsorm.annotations;

import org.kucro3.kraitsorm.misc.PlaceHolder;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Column {
    public String name() default "";

    public Class<?> adapter() default PlaceHolder.class;
}
