package ru.task6;

import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Info {
    String author();
    int dateOfCreation() default 2020;
    String purpose();

}
