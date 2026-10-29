package StringIOAndSearching;
/*
 * Q3. Concatenate Strings Using StringBuffer
 * Concatenate all strings in an array using StringBuffer.
 */
public class ConcatenateStringsUsingStringBuffer {
    // Concatenate strings using StringBuffer
    static String concatenateStrings(String[] arr) {
        StringBuffer sb = new StringBuffer();
        for (String str : arr) {
            sb.append(str);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String[] words = {"Hello", " ", "World", " ", "Java"};
        System.out.println("Concatenated String: "
                + concatenateStrings(words));
    }
}
