package rockpaperscissors;

import java.util.Random;

public class computer extends gameItems{
      
    private Random rand;
    
    public computer(){
        
        super();
        rand = new Random();   
    }
    
    public CHOICES getChoice(){
        
        int choice = 1 + rand.nextInt(3);
        
        switch(choice){
            
            case 1: 
                return CHOICES.ROCK;
            case 2:
                return CHOICES.PAPER;
        }
        //case 3 / else
        return CHOICES.SCISSORS;
    }
    
}

