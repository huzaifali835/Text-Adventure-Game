import java.util.Scanner;

public class Game {
    private Player player;
    private boolean gameOver;

    public Game(Player player) {
        this.player = player;
        this.gameOver = false;
    }

    public void start() {
        System.out.println("Welcome to the Haunted House Adventure!");
        System.out.println("You find yourself at the entrance of a spooky house.");

        Scanner scanner = new Scanner(System.in);

        while (!gameOver) {
            System.out.println();
            System.out.println("You are in " + player.getCurrentRoom().getDescription());
            System.out.println("Available directions: ");
            System.out.println("1. North");
            System.out.println("2. South");
            System.out.println("3. East");
            System.out.println("4. West");
            System.out.println("Choose a direction (1-4): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    player.moveNorth();
                    break;
                case 2:
                    player.moveSouth();
                    break;
                case 3:
                    player.moveEast();
                    break;
                case 4:
                    player.moveWest();
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                    continue;
            }
        }

        scanner.close();
    }
}
