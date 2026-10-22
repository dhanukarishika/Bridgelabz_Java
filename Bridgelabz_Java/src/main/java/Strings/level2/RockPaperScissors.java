
/*
 * Program 9: Create a Rock-Paper-Scissors game between
 * a user and a computer using Math.random().
 * Display game results, wins, averages, and percentages.
 */
package Strings.level2;

import java.util.Scanner;
public class RockPaperScissors {
    // Method to generate the computer's choice
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        if (choice == 0) {
            return "Rock";
        } else if (choice == 1) {
            return "Paper";
        } else {
            return "Scissors";
        }
    }
    // Method to determine the winner
    public static String findWinner(String userChoice, String computerChoice) {
        if (userChoice.equalsIgnoreCase(computerChoice)) {
            return "Draw";
        }
        if ((userChoice.equalsIgnoreCase("Rock")
                && computerChoice.equals("Scissors"))
                || (userChoice.equalsIgnoreCase("Paper")
                && computerChoice.equals("Rock"))
                || (userChoice.equalsIgnoreCase("Scissors")
                && computerChoice.equals("Paper"))) {
            return "User";
        }
        return "Computer";
    }
    // Method to calculate wins, averages, and percentages
    public static String[][] calculateStatistics(int userWins, int computerWins, int draws, int totalGames) {
        String[][] statistics = new String[3][4];
        String[] players = {"User", "Computer", "Draw"};
        int[] wins = {userWins, computerWins, draws}
        for (int i = 0; i < players.length; i++) {
            double average = (double) wins[i] / totalGames;
            double percentage = average * 100;
            statistics[i][0] = players[i];
            statistics[i][1] = String.valueOf(wins[i]);
            statistics[i][2] = String.format("%.2f", average);
            statistics[i][3] = String.format("%.2f", percentage);
        }
        return statistics;
    }
    // Method to display the result of each game
    public static void displayGameResults(String[][] results) {
        System.out.println("\nGame Results:");
        System.out.printf("%-10s %-15s %-15s %-15s%n", "Game", "User Choice", "Computer Choice", "Winner");
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < results.length; i++) {
            System.out.printf("%-10d %-15s %-15s %-15s%n", i + 1, results[i][0], results[i][1], results[i][2]);
        }
    }
    // Method to display game statistics
    public static void displayStatistics(String[][] statistics) {
        System.out.println("\nGame Statistics:");
        System.out.printf("%-15s %-10s %-15s %-15s%n", "Result", "Wins", "Average", "Percentage");
        System.out.println("-------------------------------------------------------");
        for (int i = 0; i < statistics.length; i++) {
            System.out.printf("%-15s %-10s %-15s %-15s%n",
                    statistics[i][0],
                    statistics[i][1],
                    statistics[i][2],
                    statistics[i][3] + "%");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int numberOfGames = sc.nextInt();
        if (numberOfGames <= 0) {
            System.out.println("Number of games must be positive.");
            sc.close();
            return;
        }
        String[][] gameResults = new String[numberOfGames][3];
        int userWins = 0;
        int computerWins = 0;
        int draws = 0;
        // Play the specified number of games
        for (int i = 0; i < numberOfGames; i++) {
            String userChoice;
            while (true) {
                System.out.print("\nGame " + (i + 1) + " - Enter Rock, Paper, or Scissors: ");
                userChoice = sc.next();
                if (userChoice.equalsIgnoreCase("Rock")
                        || userChoice.equalsIgnoreCase("Paper")
                        || userChoice.equalsIgnoreCase("Scissors")) {
                    break;
                }
                System.out.println("Invalid choice. Try again.");
            }
            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);
            gameResults[i][0] = userChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;
            if (winner.equals("User")) {
                userWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            } else {
                draws++;
            }
            System.out.println("Computer chose: " + computerChoice);
            System.out.println("Winner: " + winner);
        }
        // Calculate statistics
        String[][] statistics = calculateStatistics(userWins, computerWins, draws, numberOfGames);
        // Display results
        displayGameResults(gameResults);
        displayStatistics(statistics);
        sc.close();
    }
}
