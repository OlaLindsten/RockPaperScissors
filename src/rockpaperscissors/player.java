package rockpaperscissors;

import java.util.Scanner;

public class player extends gameItems{
   
    Scanner scan;
    
    public player(){
        
        super();
        scan = new Scanner(System.in);
    
}
    public gameItems.CHOICES getChoice(){
          
        System.out.println("Please enter you choice: \"rock\", \"paper\" or \"scissors\"");
       
        char playerChoice = scan.nextLine().toUpperCase().charAt(0);
        
        switch(playerChoice){
            
            case 'R':
                return CHOICES.ROCK;
            case 'P':
                return CHOICES.PAPER;
            case 'S':
                return CHOICES.SCISSORS;
        }
        //om användaren skrev fel
        System.out.println("Invalid input :P");
        return getChoice();
    }
}

