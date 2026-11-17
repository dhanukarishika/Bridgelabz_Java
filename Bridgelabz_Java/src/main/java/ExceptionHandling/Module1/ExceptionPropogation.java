/*
 * This program demonstrates exception propagation through multiple methods.
 * An arithmetic exception travels from method1() through method2() to the main method, where it is handled.
 */
package ExceptionHandling.Module1;
public class ExceptionPropogation {
    public static void main(String[] args) {
        // Creates an object to access the methods of this class.
        ExceptionPropogation obj = new ExceptionPropogation();
        // Calls method2() and catches the arithmetic exception propagated to main().
        try {
            obj.method2();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
    // Performs a division that causes an ArithmeticException.
    public void method1() throws ArithmeticException {
        System.out.println(5 / 0);
    }
    // Calls method1(), allowing its exception to propagate to the calling method.
    public void method2() {
        method1();
    }
}