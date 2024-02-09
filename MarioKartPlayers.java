public class MarioKartPlayers{
    private String playerName;
    private String character;
    private int speed;

    public MarioKartPlayers (String playerName, String character, int speed) {
        this.playerName = playerName;
        this.character = character;
        this.speed = speed;
    }

    public void boost() {
        // Simulate boosting by increasing speed
        this.speed += 10;
    }

    public void displayInfo() {
        System.out.println("Name: " + playerName);
        System.out.println("Character: " + character);
        System.out.println("Speed: " + speed);
    }

    }


