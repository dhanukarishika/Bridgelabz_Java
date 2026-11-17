
/*
 * This program demonstrates handling different exceptions using multiple catch blocks.
 * It shows how a NullPointerException is caught when accessing an array that is null.
 */

package ExceptionHandling.Module1;
import java.util.Scanner;
public class MultipleCatchBlocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int[] arr;
            //System.out.println("Enter the array integers");
//            for(int i=0;i< arr.length;i++){
//                arr[i] = sc.nextInt();
//            }
            //System.out.println(arr[6]);
            // Assigns null to the array reference.
            arr = null;
            // Attempts to access an element of a null array, causing a NullPointerException.
            System.out.println(arr[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handles attempts to access an invalid array index.
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            // Handles attempts to use an array reference that points to null.
            System.out.println(e.getMessage());
        }
    }
}