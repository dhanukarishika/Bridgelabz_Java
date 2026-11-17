
package Annotation;
import java.lang.annotation.*;
/*
 * Q1. Custom Method Annotation
 * Define a runtime annotation to store method information.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MethodInfo {
    String author() default "Rishika Dhanuka";
    String date();
    int revision() default 1;
    String comments() default "";
}
