import com.Players.PlayableCharacter;
import com.Rooms.Entrance;

import java.util.Scanner;


public class Main {

    enum Commands {
        START,
        ENTER,
        GRAB,
        QUIT,
        HELP
    }

    enum inGameCommands {
        GO,
        TALK,
        ATTACK,
        LOOK,
        GET

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ASCII_Art title_Art = new ASCII_Art();
        title_Art.title_screen_image();

        while(true) {
            System.out.println("What do you wanna do: ");
            String name = scan.nextLine();
            if(name.equalsIgnoreCase(Commands.START.name())){
                System.out.println("Let the game begin.");
                System.out.println("What is your name: ");
                String playerName = scan.nextLine();
                PlayableCharacter player = new PlayableCharacter(playerName);
                System.out.println("Welcome to the adventure " + player.getName() + ". Before you is a cavernous hole that leads into an abyss that echoes howls and wails of heroes before you, truely an eyesore around the grassy knoll that surrounds you…..do you dare enter?");
                String nextMove = scan.nextLine();
                if (nextMove.equalsIgnoreCase(Commands.ENTER.name())) {
                    Entrance entrance = new Entrance(player);

                }
            }
            else if(name.equalsIgnoreCase(Commands.QUIT.name())) {
                System.out.println("You forfeited, traitor!");
                title_Art.game_over_image();
                break;
            }
            else if(name.equalsIgnoreCase(Commands.HELP.name())) {
                for (Commands comm: Commands.values()) {
                    System.out.println(comm);
                }
            }
        }

    }
}