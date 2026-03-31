package collections;
import java.time.LocalDate;
import java.util.*;
class Policy implements Comparable<Policy> {
    int policyNumber;
    String policyHolderName;
    LocalDate expiryDate;
    String coverageType;
    double premiumAmount;
    // Constructor
    Policy(int policyNumber, String policyHolderName,LocalDate expiryDate, String coverageType,double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }
    // Used by TreeSet to sort policies by expiry date
    @Override
    public int compareTo(Policy p) {
        return this.expiryDate.compareTo(p.expiryDate);
    }
    // Ensures uniqueness based on policy number
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Policy)) return false;
        Policy p = (Policy) o;
        return policyNumber == p.policyNumber;
    }
    // Required for HashSet uniqueness
    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }
    // Display policy details
    @Override
    public String toString() {
        return "Policy{" +
                "Number=" + policyNumber +
                ", Name='" + policyHolderName + '\'' +
                ", Expiry=" + expiryDate +
                ", Coverage='" + coverageType + '\'' +
                ", Premium=" + premiumAmount +
                '}';
    }
}
class PolicyManager {
    Set<Policy> hashSet = new HashSet<>();
    Set<Policy> linkedHashSet = new LinkedHashSet<>();
    Set<Policy> treeSet = new TreeSet<>();
    void addPolicy(Policy p) {
        hashSet.add(p);
        linkedHashSet.add(p);
        treeSet.add(p);
    }
    void displayAll(Set<Policy> set) {
        for (Policy p : set) {
            System.out.println(p);
        }
    }
    void expiringSoon() {
        LocalDate limit = LocalDate.now().plusDays(30);
        System.out.println("\nPolicies expiring within 30 days:");
        for (Policy p : hashSet) {
            if (!p.expiryDate.isAfter(limit)) {
                System.out.println(p);
            }
        }
    }
    void byCoverage(String type) {
        System.out.println("\nPolicies with coverage type: " + type);
        for (Policy p : hashSet) {
            if (p.coverageType.equalsIgnoreCase(type)) {
                System.out.println(p);
            }
        }
    }
    void performanceTest() {
        Policy temp = new Policy(999, "Test",LocalDate.now(), "Health", 1000);
        long start, end;
        start = System.nanoTime();
        hashSet.add(temp);
        hashSet.contains(temp);
        hashSet.remove(temp);
        end = System.nanoTime();
        System.out.println("\nHashSet Time: " + (end - start) + " ns");
        start = System.nanoTime();
        linkedHashSet.add(temp);
        linkedHashSet.contains(temp);
        linkedHashSet.remove(temp);
        end = System.nanoTime();
        System.out.println("LinkedHashSet Time: " + (end - start) + " ns");
        start = System.nanoTime();
        treeSet.add(temp);
        treeSet.contains(temp);
        treeSet.remove(temp);
        end = System.nanoTime();
        System.out.println("TreeSet Time: " + (end - start) + " ns");
    }
}
public class InsurancePolicyManagement {
    public static void main(String[] args) {
        PolicyManager manager = new PolicyManager();
        manager.addPolicy(new Policy(101, "Dheeraj",LocalDate.now().plusDays(10), "Health", 5000));
        manager.addPolicy(new Policy(102, "Lavish",LocalDate.now().plusDays(40), "Auto", 3000));
        manager.addPolicy(new Policy(103, "Aman",LocalDate.now().plusDays(20), "Home", 7000));
        manager.addPolicy(new Policy(104, "Kamal",LocalDate.now().plusDays(5), "Health", 4500));
        System.out.println("All Policies (HashSet):");
        manager.displayAll(manager.hashSet);
        System.out.println("\nInsertion Order (LinkedHashSet):");
        manager.displayAll(manager.linkedHashSet);
        System.out.println("\nSorted by Expiry Date (TreeSet):");
        manager.displayAll(manager.treeSet);
        manager.expiringSoon();
        manager.byCoverage("Health");
        manager.performanceTest();
    }
}
