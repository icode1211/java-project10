package chap06.annotation;

//  @AnnotationName(elementOne="", elementTwo=10)
//  @AnnotationName("value아무거나")

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.TYPE, ElementType.CONSTRUCTOR})
public @interface AnnotationName {
    String value() default "";
    String elementOne() default "";
    int elementTwo() default 2;
}
