
package LinkedList.Single;

import java.util.ArrayList;

/*
 * Q7. Singly Linked List: Social Media Friend Connections
 * Add, remove, search, display, and count friends.
 * Find mutual friends between users.
 */

public class SocialMediaFriendConnections {

    // Node to store user details
    static class User {
        int id, age;
        String name;
        ArrayList<Integer> friends = new ArrayList<>();
        User next;

        User(int id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }
    }

    static User head = null, tail = null;

    // Add user to linked list
    static void addUser(int id, String name, int age) {
        User newNode = new User(id, name, age);

        if (head == null) head = tail = newNode;
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Find user by ID
    static User findUser(int id) {
        User temp = head;
        while (temp != null) {
            if (temp.id == id) return temp;
            temp = temp.next;
        }
        return null;
    }

    // Add friend connection between two users
    static void addConnection(int id1, int id2) {
        User u1 = findUser(id1);
        User u2 = findUser(id2);

        if (u1 == null || u2 == null || id1 == id2) {
            System.out.println("Invalid users");
            return;
        }

        if (!u1.friends.contains(id2)) u1.friends.add(id2);
        if (!u2.friends.contains(id1)) u2.friends.add(id1);
    }

    // Remove friend connection
    static void removeConnection(int id1, int id2) {
        User u1 = findUser(id1);
        User u2 = findUser(id2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found");
            return;
        }

        u1.friends.remove(Integer.valueOf(id2));
        u2.friends.remove(Integer.valueOf(id1));
    }

    // Find mutual friends
    static void mutualFriends(int id1, int id2) {
        User u1 = findUser(id1);
        User u2 = findUser(id2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found");
            return;
        }

        boolean found = false;

        for (int id : u1.friends) {
            if (u2.friends.contains(id)) {
                User friend = findUser(id);
                System.out.println(friend.id + " | " + friend.name);
                found = true;
            }
        }

        if (!found) System.out.println("No mutual friends");
    }

    // Display friends of a user
    static void displayFriends(int id) {
        User user = findUser(id);

        if (user == null) {
            System.out.println("User not found");
            return;
        }

        for (int friendId : user.friends) {
            User friend = findUser(friendId);
            System.out.println(friend.id + " | " + friend.name);
        }
    }

    // Search user by name
    static void searchByName(String name) {
        User temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                System.out.println(temp.id + " | " + temp.name + " | " + temp.age);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) System.out.println("User not found");
    }

    // Search user by ID
    static void searchById(int id) {
        User user = findUser(id);

        if (user != null)
            System.out.println(user.id + " | " + user.name + " | " + user.age);
        else
            System.out.println("User not found");
    }

    // Count friends for each user
    static void countFriends() {
        User temp = head;

        while (temp != null) {
            System.out.println(temp.name + ": " + temp.friends.size() + " friends");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        addUser(101, "Rishika", 21);
        addUser(102, "Vaidehi", 21);
        addUser(103, "Ananya", 20);
        addUser(104, "Aarav", 22);

        addConnection(101, 102);
        addConnection(101, 103);
        addConnection(102, 103);
        addConnection(102, 104);

        System.out.println("Rishika's Friends:");
        displayFriends(101);

        System.out.println("\nMutual Friends of Rishika and Vaidehi:");
        mutualFriends(101, 102);

        System.out.println("\nSearch by Name:");
        searchByName("Ananya");

        System.out.println("\nSearch by ID:");
        searchById(104);

        System.out.println("\nFriend Counts:");
        countFriends();

        removeConnection(101, 103);

        System.out.println("\nRishika's Friends After Removal:");
        displayFriends(101);
    }
}
