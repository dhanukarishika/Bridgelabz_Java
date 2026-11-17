
package Annotation;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

/*
 * Q1. Annotation Example JUnit Testing
 * Test custom annotations, their values, runtime
 * availability, and annotated methods using reflection.
 */

class AnnotationExampleTest {

    // Test whether the custom annotation is available at runtime
    @Test
    void testAnnotationAvailableAtRuntime() throws NoSuchMethodException {
        Method method = AnnotationExample.class
                .getDeclaredMethod("displayMessage");

        assertTrue(method.isAnnotationPresent(MethodInfo.class));
    }

    // Test explicitly assigned annotation values
    @Test
    void testAnnotationValues() throws NoSuchMethodException {
        Method method = AnnotationExample.class
                .getDeclaredMethod("toString");

        MethodInfo annotation = method.getAnnotation(MethodInfo.class);

        assertNotNull(annotation);
        assertEquals("Rishika Dhanuka", annotation.author());
        assertEquals("17-Nov-2026", annotation.date());
        assertEquals(1, annotation.revision());
        assertEquals("Overridden toString method", annotation.comments());
    }

    // Test default annotation values
    @Test
    void testDefaultAnnotationValues() throws NoSuchMethodException {
        Method method = AnnotationExample.class
                .getDeclaredMethod("displayMessage");

        MethodInfo annotation = method.getAnnotation(MethodInfo.class);

        assertNotNull(annotation);
        assertEquals("Rishika Dhanuka", annotation.author());
        assertEquals(2, annotation.revision());
        assertEquals("17-Nov-2026", annotation.date());
        assertEquals("Displays a welcome message", annotation.comments());
    }

    // Test a method without the custom annotation
    @Test
    void testMethodWithoutAnnotation() throws NoSuchMethodException {
        Method method = AnnotationExample.class
                .getDeclaredMethod("normalMethod");

        assertFalse(method.isAnnotationPresent(MethodInfo.class));
    }

    // Test whether the deprecated method has both annotations
    @Test
    void testDeprecatedMethodAnnotation() throws NoSuchMethodException {
        Method method = AnnotationExample.class
                .getDeclaredMethod("oldMethod");

        assertTrue(method.isAnnotationPresent(Deprecated.class));
        assertTrue(method.isAnnotationPresent(MethodInfo.class));
    }

    // Test the revision number
    @Test
    void testRevisionNumber() throws NoSuchMethodException {
        Method method = AnnotationExample.class
                .getDeclaredMethod("displayMessage");

        MethodInfo annotation = method.getAnnotation(MethodInfo.class);

        assertNotNull(annotation);
        assertEquals(2, annotation.revision());
    }

    // Test the number of methods with custom annotations
    @Test
    void testAnnotatedMethods() {
        int annotatedMethodCount = 0;

        for (Method method : AnnotationExample.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(MethodInfo.class)) {
                annotatedMethodCount++;
            }
        }

        assertEquals(3, annotatedMethodCount);
    }

    // Test the overridden toString method
    @Test
    void testToStringMethod() {
        AnnotationExample example = new AnnotationExample();

        assertEquals("Annotation Example", example.toString());
    }
}
