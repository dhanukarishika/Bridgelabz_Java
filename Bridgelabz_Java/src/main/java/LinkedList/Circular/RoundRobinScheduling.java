
package LinkedList.Circular;

/*
 * Q6. Circular Linked List: Round Robin Scheduling
 * Add, remove, schedule processes, and calculate average
 * waiting time and turnaround time.
 */

public class RoundRobinScheduling {

    // Node to store process details
    static class Process {
        int id, burstTime, remainingTime, priority;
        Process next;

        Process(int id, int burstTime, int priority) {
            this.id = id;
            this.burstTime = burstTime;
            this.remainingTime = burstTime;
            this.priority = priority;
        }
    }

    static Process head = null, tail = null;
    static int count = 0;

    // Add process at end
    static void addProcess(int id, int burstTime, int priority) {
        if (burstTime <= 0) return;

        Process newNode = new Process(id, burstTime, priority);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        tail.next = head;
        count++;
    }

    // Remove process by ID
    static void removeProcess(int id) {
        if (head == null) return;

        Process temp = head, prev = tail;

        do {
            if (temp.id == id) {
                if (head == tail) {
                    head = tail = null;
                } else {
                    prev.next = temp.next;

                    if (temp == head) head = temp.next;
                    if (temp == tail) tail = prev;
                }

                temp.next = null;
                count--;
                return;
            }

            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    // Display processes in circular queue
    static void display() {
        if (head == null) {
            System.out.println("Queue is empty");
            return;
        }

        Process temp = head;

        do {
            System.out.println("P" + temp.id + " | Remaining: "
                    + temp.remainingTime + " | Priority: " + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }

    // Simulate round robin scheduling
    static void schedule(int quantum) {
        if (head == null || quantum <= 0) {
            System.out.println("Invalid queue or time quantum");
            return;
        }

        int time = 0, round = 1;
        int totalProcesses = count;
        double totalWaiting = 0, totalTurnaround = 0;

        Process current = head;

        while (head != null) {
            int active = count;

            System.out.println("\nRound " + round + ":");

            // Each active process runs once per round
            for (int i = 0; i < active; i++) {
                int execution = Math.min(quantum, current.remainingTime);

                current.remainingTime -= execution;
                time += execution;

                System.out.println("P" + current.id + " executed for "
                        + execution + " units");

                Process next = current.next;

                // Remove process after completion
                if (current.remainingTime == 0) {
                    int turnaround = time;
                    int waiting = turnaround - current.burstTime;

                    totalTurnaround += turnaround;
                    totalWaiting += waiting;

                    removeProcess(current.id);
                }

                if (head == null) break;
                current = next;
            }

            System.out.println("Queue after Round " + round + ":");
            display();
            round++;
        }

        System.out.printf("\nAverage Waiting Time: %.2f%n",
                totalWaiting / totalProcesses);
        System.out.printf("Average Turnaround Time: %.2f%n",
                totalTurnaround / totalProcesses);
    }

    public static void main(String[] args) {
        addProcess(101, 5, 2);
        addProcess(102, 3, 1);
        addProcess(103, 7, 3);

        int quantum = 2;

        System.out.println("Initial Process Queue:");
        display();

        schedule(quantum);
    }
}
