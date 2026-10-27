
package LinkedList.Circular;

/*
 * Q3. Circular Linked List: Task Scheduler
 * Add, remove, view, navigate, display, and search tasks.
 */

public class TaskScheduler {

    // Node to store task details
    static class Task {
        int id, priority;
        String name, dueDate;
        Task next;

        Task(int id, String name, int priority, String dueDate) {
            this.id = id;
            this.name = name;
            this.priority = priority;
            this.dueDate = dueDate;
        }
    }

    static Task head = null, tail = null, current = null;
    static int size = 0;

    // Add task at beginning
    static void addBeginning(int id, String name, int priority, String date) {
        Task newNode = new Task(id, name, priority, date);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        tail.next = head;
        current = head;
        size++;
    }

    // Add task at end
    static void addEnd(int id, String name, int priority, String date) {
        Task newNode = new Task(id, name, priority, date);

        if (head == null) {
            head = tail = current = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        tail.next = head;
        size++;
    }

    // Add task at specific position (1-based)
    static void addPosition(int pos, int id, String name, int priority, String date) {
        if (pos < 1 || pos > size + 1) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 1) {
            addBeginning(id, name, priority, date);
            return;
        }

        if (pos == size + 1) {
            addEnd(id, name, priority, date);
            return;
        }

        Task temp = head;
        for (int i = 1; i < pos - 1; i++)
            temp = temp.next;

        Task newNode = new Task(id, name, priority, date);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    // Remove task by ID
    static void removeTask(int id) {
        if (head == null) return;

        Task temp = head, prev = tail;

        do {
            if (temp.id == id) {
                if (head == tail) {
                    head = tail = current = null;
                } else {
                    prev.next = temp.next;

                    if (temp == head) head = temp.next;
                    if (temp == tail) tail = prev;
                    if (temp == current) current = temp.next;
                }

                temp.next = null;
                size--;
                return;
            }

            prev = temp;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Task not found");
    }

    // Display task details
    static void showTask(Task task) {
        System.out.println(task.id + " | " + task.name + " | "
                + task.priority + " | " + task.dueDate);
    }

    // View current task
    static void viewCurrent() {
        if (current == null) {
            System.out.println("No tasks available");
            return;
        }
        showTask(current);
    }

    // Move to next task
    static void nextTask() {
        if (current != null)
            current = current.next;
    }

    // Display all tasks
    static void display() {
        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        Task temp = head;
        do {
            showTask(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // Search tasks by priority
    static void searchPriority(int priority) {
        if (head == null) return;

        Task temp = head;
        boolean found = false;

        do {
            if (temp.priority == priority) {
                showTask(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) System.out.println("No tasks found");
    }

    public static void main(String[] args) {
        addEnd(101, "Assignment", 2, "30-10-2026");
        addBeginning(102, "Project", 1, "29-10-2026");
        addPosition(2, 103, "Presentation", 2, "31-10-2026");

        System.out.println("All Tasks:");
        display();

        System.out.println("\nCurrent Task:");
        viewCurrent();

        nextTask();
        System.out.println("\nNext Task:");
        viewCurrent();

        System.out.println("\nTasks with Priority 2:");
        searchPriority(2);

        removeTask(103);

        System.out.println("\nTasks After Deletion:");
        display();
    }
}
