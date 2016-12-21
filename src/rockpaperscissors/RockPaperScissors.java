package rockpaperscissors;

import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
            
            game game = new game();
            char quit = ' ';
                            
            game.play();
            
            while(quit != 'N'){
            
                game.play();
            
            System.out.println("Do you wanna play again?" + "\n");
            quit = scan.nextLine().toUpperCase().charAt(0);
        }
            scan.close();
            game.showStats();
        
    }
    
}
