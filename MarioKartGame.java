public static void main(String[] args) {
        // Instantiate two MarioKartPlayer objects
        MarioKartPlayers player1 = new MarioKartPlayers("Player1", "Mario", 50);
        MarioKartPlayers player2 = new MarioKartPlayers("Player2", "Luigi", 45);

        // Display information of both players
        System.out.println("Initial Player Information:");
        System.out.println("Player 1");
        player1.displayInfo();
        System.out.println("Player 2");
        player2.displayInfo();

        // Simulate boost action for each player
        player1.boost();
        player2.boost();

        // Display updated information of both players after boost
        System.out.println("\nPlayer Information after Boost:");
        System.out.println("Player 1");
        player1.displayInfo();
        System.out.println("Player 2");
        player2.displayInfo();
    }
}
