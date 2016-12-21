package rockpaperscissors;

public class game extends gameItems{
    
    private player Player;
    private computer Computer;
    private CHOICES PlayerChoice;
    private CHOICES ComputerChoice;
    private RESULT result;
    private static int wins;
    private static int loses;
    private static int draw;
    

    public game() {

        super();
        Player = new player();
        Computer = new computer();
    }

    public void play() {

        PlayerChoice = Player.getChoice();
        ComputerChoice = Computer.getChoice();
        result = getResults();
        showResults();
        stats();

    }
    public void showStats(){
        
        System.out.println("You have played " + (wins + loses + draw) + " times"+ "\n");
        System.out.println("You have won " + wins + " times" + "\n");
        System.out.println("You have lost " + loses + " times" + "\n");
        System.out.println("It was a draw " + draw + " times."  + "\n GG wp");
        
    }

    private RESULT getResults() {

        if (PlayerChoice == ComputerChoice) {
            return RESULT.DRAW;
        }

        switch (PlayerChoice) {

            case ROCK:
                return (ComputerChoice == CHOICES.SCISSORS ? RESULT.WIN : RESULT.LOSE);

            case PAPER:
                return (ComputerChoice == CHOICES.ROCK ? RESULT.WIN : RESULT.LOSE);

            case SCISSORS:
                return (ComputerChoice == CHOICES.PAPER ? RESULT.WIN : RESULT.LOSE);

        }
        //kommer aldrig hit går igenom alla möjligheter
        return RESULT.DRAW;
    }

        
    private void showResults(){
        
        switch(result){
            
            case WIN:
                System.out.println(PlayerChoice + " beats " + ComputerChoice + " |--| You le won");
                break;

                
            case LOSE:
                System.out.println(PlayerChoice + " beats " + ComputerChoice + " |--| You le lost");
                break;
                
            case DRAW:
                System.out.println(PlayerChoice + " beats " + ComputerChoice + " |--| It is le draw");
                break;
        }
    }
    
    private void stats(){
        
        if(result == RESULT.WIN){
            wins++;
        }else if(result == RESULT.LOSE){
            loses++;
        }else
            draw++;
        
    }
    
    
}

   
