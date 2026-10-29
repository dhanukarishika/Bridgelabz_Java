package StringIOAndSearching;
/*
 * Q4. Compare StringBuffer with StringBuilder
 * Compare execution time for concatenating 1 million strings.
 */
public class StringBufferVsStringBuilder {
    public static void main(String[] args) {
        int n = 1000000;
        String str = "hello";
        // Measure StringBuilder execution time
        StringBuilder sb = new StringBuilder();
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sb.append(str);
        }
        long builderTime = System.nanoTime() - start;
        // Measure StringBuffer execution time
        StringBuffer buffer = new StringBuffer();
        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            buffer.append(str);
        }
        long bufferTime = System.nanoTime() - start;
        System.out.println("StringBuilder Time: " + builderTime / 1000000.0 + " ms");
        System.out.println("StringBuffer Time: " + bufferTime / 1000000.0 + " ms");
    }
}
