package com.Mechanics;

import java.util.Scanner;

public class InGameMovement {
    public void userInput(){
        enum Commands {
            START,
            ENTER,
            GRAB,
            QUIT,
            HELP
        }

        enum gameMovement {
            GO("NORTH"),
            GO("SOUTH");
            private String direction;

            gameMovement(String direction){
                this.direction = direction;
            }

        }

        enum directions{
            NORTH,
            SOUTH,
            WEST,
            EAST
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("What action would you like to perform: ");
        String input = scan.nextLine();
        String finalInput = input.toUpperCase();
        if(finalInput == GO && finalInput == SOUTH)
    }
}
