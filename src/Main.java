public class Main {
    public static void main(String[] args) {
        // Create rooms for the haunted house
        Room entrance = new Room("the entrance of the haunted house");
        Room livingRoom = new Room("the living room");
        Room kitchen = new Room("the kitchen");
        Room bedroom = new Room("a spooky bedroom");

        // Connect rooms
        entrance.setNorth(livingRoom);
        livingRoom.setSouth(entrance);
        livingRoom.setEast(kitchen);
        kitchen.setWest(livingRoom);
        livingRoom.setNorth(bedroom);
        bedroom.setSouth(livingRoom);

        // Create player starting in the entrance
        Player player = new Player(entrance);

        // Start the game
        Game game = new Game(player);
        game.start();
    }
}
