
package StacksAndQueues.Queue;

import java.util.Queue;
import java.util.LinkedList;

/*
 * Q5. Circular Tour Problem
 * Find the starting petrol pump to complete a circular tour.
 */

public class CircularTourProblem {

    // Find starting petrol pump
    static int findStartingPump(int[] petrol, int[] distance) {
        int n = petrol.length;

        if (n == 0 || n != distance.length) return -1;

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            queue.add(i);
        }

        int start = 0, fuel = 0, total = 0;

        // Process petrol pumps in order
        while (!queue.isEmpty()) {
            int i = queue.poll();

            int remaining = petrol[i] - distance[i];
            fuel += remaining;
            total += remaining;

            // Move starting point if petrol is insufficient
            if (fuel < 0) {
                start = i + 1;
                fuel = 0;
            }
        }

        // Check whether complete tour is possible
        return total >= 0 ? start : -1;
    }

    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int start = findStartingPump(petrol, distance);

        if (start != -1) {
            System.out.println("Starting Petrol Pump Index: " + start);
            System.out.println("Starting Petrol Pump Number: " + (start + 1));
        } else {
            System.out.println("Circular tour is not possible");
        }
    }
}
