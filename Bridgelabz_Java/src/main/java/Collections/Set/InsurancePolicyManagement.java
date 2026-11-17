package Collections.Set;
import java.time.LocalDate;
import java.util.*;
/*
 * Q6. Insurance Policy Management System
 * Manage unique policies using HashSet, LinkedHashSet, and TreeSet.
 * Retrieve policies, detect duplicates, and compare performance.
 */
public class InsurancePolicyManagement {
    static class Policy {
        String number, holderName, coverageType;
        LocalDate expiryDate;
        double premium;
        Policy(String number, String holderName, LocalDate expiryDate,
               String coverageType, double premium) {
            this.number = number;
            this.holderName = holderName;
            this.expiryDate = expiryDate;
            this.coverageType = coverageType;
            this.premium = premium;
        }
        // Policies are unique based on policy number
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof Policy)) return false;
            Policy other = (Policy) obj;
            return number.equals(other.number);
        }
        @Override
        public int hashCode() {
            return number.hashCode();
        }
        @Override
        public String toString() {
            return number + " (" + holderName + ", " + coverageType
                    + ", " + expiryDate + ", " + premium + ")";
        }
    }
    Set<Policy> hashPolicies = new HashSet<>();
    Set<Policy> linkedPolicies = new LinkedHashSet<>();
    // Sort by expiry date, then policy number
    Set<Policy> treePolicies = new TreeSet<>(
            Comparator.comparing((Policy p) -> p.expiryDate)
                    .thenComparing(p -> p.number)
    );
    List<String> duplicates = new ArrayList<>();
    // Add unique policies to all three sets
    public void addPolicy(Policy policy) {
        if (hashPolicies.add(policy)) {
            linkedPolicies.add(policy);
            treePolicies.add(policy);
        } else {
            duplicates.add(policy.number);
        }
    }
    // Display policies expiring within 30 days
    public void expiringSoon() {
        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(30);

        for (Policy p : treePolicies) {
            if (!p.expiryDate.isBefore(today)
                    && !p.expiryDate.isAfter(limit)) {
                System.out.println(p);
            }
        }
    }
    // Display policies by coverage type
    public void searchByCoverage(String type) {
        for (Policy p : linkedPolicies) {
            if (p.coverageType.equalsIgnoreCase(type)) {
                System.out.println(p);
            }
        }
    }
    // Measure adding, searching, and removing times
    public static void measurePerformance(String name, Set<Policy> set,
                                          List<Policy> policies) {
        long start = System.nanoTime();

        for (Policy p : policies) set.add(p);
        long addTime = System.nanoTime() - start;

        start = System.nanoTime();
        for (Policy p : policies) set.contains(p);
        long searchTime = System.nanoTime() - start;

        start = System.nanoTime();
        for (Policy p : policies) set.remove(p);
        long removeTime = System.nanoTime() - start;

        System.out.printf("%s: Add = %.2f ms, Search = %.2f ms, Remove = %.2f ms%n",
                name, addTime / 1e6, searchTime / 1e6, removeTime / 1e6);
    }

    public static void main(String[] args) {
        InsurancePolicyManagement system = new InsurancePolicyManagement();
        LocalDate today = LocalDate.now();

        system.addPolicy(new Policy("P101", "Rishika", today.plusDays(10), "Health", 12000));
        system.addPolicy(new Policy("P102", "Aarav", today.plusDays(40), "Auto", 15000));
        system.addPolicy(new Policy("P103", "Meera", today.plusDays(20), "Home", 10000));
        system.addPolicy(new Policy("P104", "Riya", today.minusDays(5), "Health", 9000));

        // Duplicate policy number
        system.addPolicy(new Policy("P101", "Rishika", today.plusDays(50), "Auto", 5000));

        System.out.println("HashSet (Unique Policies): " + system.hashPolicies);
        System.out.println("\nLinkedHashSet (Insertion Order): " + system.linkedPolicies);
        System.out.println("\nTreeSet (Expiry Order): " + system.treePolicies);

        System.out.println("\nPolicies Expiring Within 30 Days:");
        system.expiringSoon();

        System.out.println("\nHealth Policies:");
        system.searchByCoverage("Health");

        System.out.println("\nDuplicate Policy Numbers: " + system.duplicates);

        // Generate sample policies for performance testing
        List<Policy> testPolicies = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            testPolicies.add(new Policy("T" + i, "Test",
                    today.plusDays(i), "Health", 1000));
        }

        System.out.println("\nPerformance Comparison:");
        measurePerformance("HashSet", new HashSet<>(), testPolicies);
        measurePerformance("LinkedHashSet", new LinkedHashSet<>(), testPolicies);
        Set<Policy> sortedSet = new TreeSet<>(
                Comparator.comparing((Policy p) -> p.expiryDate)
                        .thenComparing(p -> p.number)
        );
        measurePerformance("TreeSet", sortedSet, testPolicies);
    }
}
