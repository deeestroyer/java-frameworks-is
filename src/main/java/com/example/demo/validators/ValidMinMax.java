package com.example.demo.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = {MinMaxValidator.class})
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidMinMax {
    String message() default "Maximum inventory has to be greater than minimum and items in stock have to be in that range";
    Class<?> [] groups() default {};
    Class<? extends Payload> [] payload() default {};
}
