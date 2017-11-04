package org.kucro3.kraitsorm.annotations.addition;

import org.kucro3.kraitsorm.addition.Attribute;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.TYPE})
@Repeatable(Addition.AdditionCollection.class)
public @interface Addition {
    public Attribute key();

    public String[] values() default {};

    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.TYPE})
    public @interface AdditionCollection
    {
        public Addition[] value();
    }
}
