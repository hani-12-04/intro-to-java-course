package com.cbfacademy;

    public class App {
    
        // method to initialise the IoC container and register mappings
        private static SimpleContainer initialiseContainer() {
            SimpleContainer container = new SimpleContainer();
    
            // Register mappings for Game and Player interfaces with their implementations
            container.register(Game.class, DiceGame.class);
            container.register(Player.class, DicePlayer.class);
    
            return container;
        }

        public static void main(String[] args){
            // initialise the IoC Container
            SimpleContainer container = initialiseContainer();

            // use the container to retrieve a game instance
            Game game = container.get(Game.class);


            // create two player instances using PlayerFactory
            //     Player player1 = PlayerFactory.create();
            //     Player player2 = PlayerFactory.create();

            // inject the players into the DiceGame ctr
            //       Game game = new DiceGame(player1, player2);


            // play the game and determine the winner
            String winner = game.play();

            if (winner == null) {
                System.out.println("It's a draw!");
            } else {
                System.out.println(winner + " wins!");
            }
        }
    }

