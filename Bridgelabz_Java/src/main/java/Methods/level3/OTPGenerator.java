
/*
 * Program 7: Generate ten six-digit OTPs, store them
 * in an array, and check whether all OTPs are unique.
 */
package Methods.level3;

public class OTPGenerator {

    // Generate a random six-digit OTP.
    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }

    // Check whether all OTPs in the array are unique.
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        // Store ten generated OTPs.
        int[] otps = new int[10];

        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        // Display all generated OTPs.
        System.out.println("Generated OTPs:");

        for (int i = 0; i < otps.length; i++) {
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }

        // Check whether all OTPs are unique.
        if (areOTPsUnique(otps)) {
            System.out.println("All 10 OTPs are unique.");
        } else {
            System.out.println("Some OTPs are repeated.");
        }
    }
}
