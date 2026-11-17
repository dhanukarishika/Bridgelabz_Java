
package Annotation;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
/*
 * Q1. Java Annotation Example
 * Demonstrate built-in and custom annotations using reflection.
 */
public class AnnotationExample {
    // Method using @Override and custom annotation
    @Override
    @MethodInfo(
            author = "Rishika Dhanuka",
            date = "17-Nov-2026",
            revision = 1,
            comments = "Overridden toString method"
    )
    public String toString() {
        return "Annotation Example";
    }

    // Method using @Deprecated and custom annotation
    @Deprecated
    @MethodInfo(
            author = "Rishika Dhanuka",
            date = "17-Nov-2026",
            comments = "This method is deprecated"
    )
    public static void oldMethod() {
        System.out.println("This is an old method.");
    }

    // Method with revision number 2
    @MethodInfo(
            date = "17-Nov-2026",
            revision = 2,
            comments = "Displays a welcome message"
    )
    public void displayMessage() {
        System.out.println("Welcome to Java Annotations!");
    }

    // Method without custom annotation
    public void normalMethod() {
        System.out.println("This method has no custom annotation.");
    }

    // Inspect method annotations using reflection
    public static void inspectAnnotations() {

        Method[] methods = AnnotationExample.class.getDeclaredMethods();

        for (Method method : methods) {

            if (method.isAnnotationPresent(MethodInfo.class)) {

                System.out.println("\nMethod: " + method.getName());

                // Retrieve custom annotation details
                MethodInfo info = method.getAnnotation(MethodInfo.class);

                System.out.println("Author: " + info.author());
                System.out.println("Date: " + info.date());
                System.out.println("Revision: " + info.revision());
                System.out.println("Comments: " + info.comments());

                // Display all runtime annotations on the method
                Annotation[] annotations = method.getDeclaredAnnotations();

                System.out.println("Annotations:");

                for (Annotation annotation : annotations) {
                    System.out.println(annotation);
                }

                // Check revision number
                if (info.revision() == 1) {
                    System.out.println("This method has revision number 1.");
                }
            }
        }
    }

    public static void main(String[] args) {

        AnnotationExample example = new AnnotationExample();

        System.out.println(example);
        example.displayMessage();
        oldMethod();

        inspectAnnotations();
    }
}
